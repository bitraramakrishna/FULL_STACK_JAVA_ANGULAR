var HttpStatusCode;
(function (HttpStatusCode) {
    HttpStatusCode[HttpStatusCode["OK"] = 200] = "OK";
    HttpStatusCode[HttpStatusCode["NotFound"] = 404] = "NotFound";
    HttpStatusCode[HttpStatusCode["AccessDenied"] = 403] = "AccessDenied";
    HttpStatusCode[HttpStatusCode["InternalError"] = 500] = "InternalError";
})(HttpStatusCode || (HttpStatusCode = {}));
var success = HttpStatusCode.OK;
var notFoundError = HttpStatusCode.NotFound;
var accessError = HttpStatusCode.AccessDenied;
console.log("Success Code: ".concat(success));
console.log("Not Found Code: ".concat(notFoundError));
console.log("Access Denied Code: ".concat(accessError));
