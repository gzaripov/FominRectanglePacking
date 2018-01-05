if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'FominRectangleBoxing'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'FominRectangleBoxing'.");
}
var FominRectangleBoxing = function (_, Kotlin) {
  'use strict';
  var addClass = Kotlin.kotlin.dom.addClass_hhb33f$;
  var throwCCE = Kotlin.throwCCE;
  var ensureNotNull = Kotlin.ensureNotNull;
  var numberToDouble = Kotlin.numberToDouble;
  var numberToInt = Kotlin.numberToInt;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var Kind_INTERFACE = Kotlin.Kind.INTERFACE;
  var Enum = Kotlin.kotlin.Enum;
  var throwISE = Kotlin.throwISE;
  Color.prototype = Object.create(Enum.prototype);
  Color.prototype.constructor = Color;
  function main(args) {
    var tmp$;
    var w = getWidth();
    var canvas = new Canvas(w, w);
    addClass(canvas.element, ['unselectable']);
    var container = Kotlin.isType(tmp$ = document.getElementById('canvas-container'), HTMLElement) ? tmp$ : throwCCE();
    container.appendChild(canvas.element);
  }
  var Math_0 = Math;
  function getWidth() {
    var a = ensureNotNull(document.documentElement).clientWidth;
    var b = window.innerWidth;
    var w = Math_0.max(a, b);
    var a_0 = ensureNotNull(document.documentElement).clientHeight;
    var b_0 = window.innerHeight;
    var h = Math_0.max(a_0, b_0);
    var width = w * 0.8;
    var height = h * 0.8;
    return Math_0.min(width, height);
  }
  function Canvas(width, height) {
    this.width_0 = 0;
    this.height_0 = 0;
    this.ratio_0 = window.devicePixelRatio;
    this.element = null;
    this.ctx_0 = null;
    var tmp$, tmp$_0;
    this.width_0 = numberToInt(numberToDouble(width) * this.ratio_0);
    this.height_0 = numberToInt(numberToDouble(height) * this.ratio_0);
    this.element = Kotlin.isType(tmp$ = document.createElement('canvas'), HTMLCanvasElement) ? tmp$ : throwCCE();
    this.element.style.width = width.toString() + 'px';
    this.element.style.height = height.toString() + 'px';
    this.element.width = this.width_0;
    this.element.height = this.height_0;
    this.ctx_0 = Kotlin.isType(tmp$_0 = this.element.getContext('2d'), CanvasRenderingContext2D) ? tmp$_0 : throwCCE();
    this.clear_0();
  }
  Canvas.prototype.clear_0 = function () {
    this.ctx_0.fillStyle = Color$White_getInstance();
    this.ctx_0.fillRect(0.0, 0.0, this.width_0, this.height_0);
  };
  Canvas.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Canvas',
    interfaces: []
  };
  function CanvasElement(canvas) {
    this.canvas_qd6gkt$_0 = canvas;
    this.layer_snuoy0$_0 = 0;
  }
  Object.defineProperty(CanvasElement.prototype, 'canvas', {
    get: function () {
      return this.canvas_qd6gkt$_0;
    }
  });
  Object.defineProperty(CanvasElement.prototype, 'layer', {
    get: function () {
      return this.layer_snuoy0$_0;
    }
  });
  CanvasElement.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'CanvasElement',
    interfaces: [Drawable]
  };
  function Drawable() {
  }
  Drawable.$metadata$ = {
    kind: Kind_INTERFACE,
    simpleName: 'Drawable',
    interfaces: []
  };
  function Color(name, ordinal, rgb) {
    Enum.call(this);
    this.rgb = rgb;
    this.name$ = name;
    this.ordinal$ = ordinal;
  }
  function Color_initFields() {
    Color_initFields = function () {
    };
    Color$White_instance = new Color('White', 0, '#fff');
    Color$Black_instance = new Color('Black', 1, '#000');
    Color$MaterialBlack_instance = new Color('MaterialBlack', 2, '#222222');
  }
  var Color$White_instance;
  function Color$White_getInstance() {
    Color_initFields();
    return Color$White_instance;
  }
  var Color$Black_instance;
  function Color$Black_getInstance() {
    Color_initFields();
    return Color$Black_instance;
  }
  var Color$MaterialBlack_instance;
  function Color$MaterialBlack_getInstance() {
    Color_initFields();
    return Color$MaterialBlack_instance;
  }
  Color.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'Color',
    interfaces: [Enum]
  };
  function Color$values() {
    return [Color$White_getInstance(), Color$Black_getInstance(), Color$MaterialBlack_getInstance()];
  }
  Color.values = Color$values;
  function Color$valueOf(name) {
    switch (name) {
      case 'White':
        return Color$White_getInstance();
      case 'Black':
        return Color$Black_getInstance();
      case 'MaterialBlack':
        return Color$MaterialBlack_getInstance();
      default:throwISE('No enum constant kt.Color.' + name);
    }
  }
  Color.valueOf_61zpoe$ = Color$valueOf;
  var package$kt = _.kt || (_.kt = {});
  package$kt.main_kand9s$ = main;
  package$kt.getWidth = getWidth;
  package$kt.Canvas = Canvas;
  package$kt.CanvasElement = CanvasElement;
  package$kt.Drawable = Drawable;
  Object.defineProperty(Color, 'White', {
    get: Color$White_getInstance
  });
  Object.defineProperty(Color, 'Black', {
    get: Color$Black_getInstance
  });
  Object.defineProperty(Color, 'MaterialBlack', {
    get: Color$MaterialBlack_getInstance
  });
  package$kt.Color = Color;
  main([]);
  Kotlin.defineModule('FominRectangleBoxing', _);
  return _;
}(typeof FominRectangleBoxing === 'undefined' ? {} : FominRectangleBoxing, kotlin);

//# sourceMappingURL=FominRectangleBoxing.js.map
