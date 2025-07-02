/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * CodeJs icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: code, js
 * - Source: ic_fluent_code_js_16_filled.svg
 * 
 * @return The [ImageVector] for the CodeJs icon.
 */
public val FluentIcons.Filled.CodeJs: ImageVector
    get() {
        if (_codeJs != null) {
            return _codeJs!!
        }
        _codeJs = Builder(name = "CodeJs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.77f, 7.3f)
                lineTo(10.772f, 7.301f)
                curveTo(11.817f, 7.693f, 13.251f, 8.23f, 13.251f, 9.75f)
                curveTo(13.248f, 10.107f, 13.173f, 10.449f, 13.027f, 10.77f)
                curveTo(12.882f, 11.093f, 12.674f, 11.377f, 12.413f, 11.612f)
                curveTo(12.152f, 11.847f, 11.849f, 12.023f, 11.512f, 12.134f)
                curveTo(11.182f, 12.243f, 10.824f, 12.284f, 10.477f, 12.249f)
                curveTo(10.409f, 12.257f, 10.336f, 12.261f, 10.263f, 12.261f)
                curveTo(10.015f, 12.261f, 9.745f, 12.218f, 9.491f, 12.134f)
                curveTo(9.154f, 12.023f, 8.852f, 11.847f, 8.59f, 11.611f)
                curveTo(8.329f, 11.376f, 8.122f, 11.093f, 7.976f, 10.77f)
                curveTo(7.83f, 10.448f, 7.755f, 10.106f, 7.752f, 9.752f)
                curveTo(7.752f, 9.55f, 7.83f, 9.362f, 7.972f, 9.22f)
                curveTo(8.256f, 8.937f, 8.75f, 8.937f, 9.033f, 9.22f)
                curveTo(9.175f, 9.361f, 9.253f, 9.55f, 9.253f, 9.75f)
                curveTo(9.253f, 10.702f, 10.294f, 10.75f, 10.503f, 10.75f)
                curveTo(10.712f, 10.75f, 11.753f, 10.702f, 11.753f, 9.75f)
                curveTo(11.753f, 9.337f, 11.306f, 9.102f, 10.239f, 8.702f)
                lineTo(10.236f, 8.701f)
                curveTo(9.189f, 8.308f, 7.753f, 7.77f, 7.753f, 6.25f)
                curveTo(7.756f, 5.893f, 7.831f, 5.551f, 7.977f, 5.23f)
                curveTo(8.122f, 4.907f, 8.329f, 4.623f, 8.591f, 4.388f)
                curveTo(8.853f, 4.152f, 9.157f, 3.976f, 9.492f, 3.867f)
                curveTo(10.1f, 3.666f, 10.905f, 3.668f, 11.514f, 3.867f)
                curveTo(11.848f, 3.976f, 12.151f, 4.152f, 12.414f, 4.389f)
                curveTo(12.675f, 4.624f, 12.882f, 4.907f, 13.028f, 5.23f)
                curveTo(13.174f, 5.552f, 13.249f, 5.894f, 13.252f, 6.248f)
                curveTo(13.252f, 6.45f, 13.174f, 6.638f, 13.032f, 6.78f)
                curveTo(12.748f, 7.063f, 12.254f, 7.063f, 11.971f, 6.78f)
                curveTo(11.829f, 6.639f, 11.751f, 6.45f, 11.751f, 6.25f)
                curveTo(11.751f, 5.298f, 10.71f, 5.25f, 10.501f, 5.25f)
                curveTo(10.292f, 5.25f, 9.251f, 5.298f, 9.251f, 6.25f)
                curveTo(9.251f, 6.663f, 9.698f, 6.898f, 10.765f, 7.298f)
                lineTo(10.77f, 7.3f)
                close()
                moveTo(5.751f, 4.5f)
                curveTo(5.751f, 4.3f, 5.829f, 4.112f, 5.971f, 3.97f)
                curveTo(6.255f, 3.687f, 6.748f, 3.687f, 7.031f, 3.97f)
                curveTo(7.173f, 4.111f, 7.251f, 4.3f, 7.251f, 4.5f)
                verticalLineTo(9.499f)
                curveTo(7.251f, 9.863f, 7.181f, 10.217f, 7.041f, 10.552f)
                curveTo(6.901f, 10.888f, 6.701f, 11.188f, 6.445f, 11.444f)
                curveTo(6.189f, 11.7f, 5.889f, 11.9f, 5.553f, 12.04f)
                curveTo(5.218f, 12.18f, 4.863f, 12.25f, 4.5f, 12.25f)
                curveTo(3.766f, 12.25f, 3.076f, 11.963f, 2.556f, 11.444f)
                curveTo(2.036f, 10.925f, 1.75f, 10.234f, 1.75f, 9.5f)
                verticalLineTo(9.0f)
                curveTo(1.75f, 8.8f, 1.828f, 8.612f, 1.97f, 8.47f)
                curveTo(2.254f, 8.187f, 2.748f, 8.187f, 3.031f, 8.47f)
                curveTo(3.173f, 8.611f, 3.251f, 8.8f, 3.251f, 9.0f)
                verticalLineTo(9.5f)
                curveTo(3.251f, 9.829f, 3.385f, 10.152f, 3.617f, 10.384f)
                curveTo(4.082f, 10.849f, 4.92f, 10.849f, 5.385f, 10.384f)
                curveTo(5.617f, 10.151f, 5.751f, 9.829f, 5.751f, 9.5f)
                verticalLineTo(4.5f)
                close()
            }
        }
        .build()
        return _codeJs!!
    }

@Suppress("ObjectPropertyName")
private var _codeJs: ImageVector? = null

@Preview
@Composable
private fun CodeJsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CodeJs, contentDescription = null)
    }
}

