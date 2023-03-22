from flask import Flask, render_template, request, redirect
from repositories import book_repository
from repositories import author_repository
from models.author import Author
from models.book import Book

from flask import Blueprint

books_blueprint = Blueprint("book", __name__)

@books_blueprint.route('/books/')
def books():
    books = book_repository.select_all()
    return render_template("books/index.html", all_books=books)