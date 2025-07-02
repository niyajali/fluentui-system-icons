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

package fluent.ui.system.icons.regular

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
 * DocumentSass icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: document, sass
 * - Source: ic_fluent_document_sass_20_regular.svg
 * 
 * @return The [ImageVector] for the DocumentSass icon.
 */
public val FluentIcons.Regular.DocumentSass: ImageVector
    get() {
        if (_documentSass != null) {
            return _documentSass!!
        }
        _documentSass = Builder(name = "DocumentSass", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                curveTo(4.0f, 2.895f, 4.895f, 2.0f, 6.0f, 2.0f)
                horizontalLineTo(10.586f)
                curveTo(10.984f, 2.0f, 11.365f, 2.158f, 11.646f, 2.439f)
                lineTo(15.561f, 6.354f)
                curveTo(15.842f, 6.635f, 16.0f, 7.016f, 16.0f, 7.414f)
                verticalLineTo(11.05f)
                curveTo(15.838f, 11.017f, 15.671f, 11.0f, 15.5f, 11.0f)
                curveTo(15.329f, 11.0f, 15.162f, 11.017f, 15.0f, 11.05f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.5f)
                curveTo(10.672f, 8.0f, 10.0f, 7.328f, 10.0f, 6.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 3.0f, 5.0f, 3.448f, 5.0f, 4.0f)
                verticalLineTo(13.4f)
                horizontalLineTo(4.998f)
                curveTo(4.967f, 12.623f, 4.582f, 11.937f, 4.0f, 11.5f)
                verticalLineTo(4.0f)
                close()
                moveTo(11.5f, 7.0f)
                horizontalLineTo(14.793f)
                lineTo(11.0f, 3.207f)
                verticalLineTo(6.5f)
                curveTo(11.0f, 6.776f, 11.224f, 7.0f, 11.5f, 7.0f)
                close()
                moveTo(2.5f, 13.0f)
                curveTo(2.224f, 13.0f, 2.0f, 13.224f, 2.0f, 13.5f)
                verticalLineTo(13.736f)
                curveTo(2.0f, 14.015f, 2.158f, 14.27f, 2.407f, 14.394f)
                lineTo(3.04f, 14.711f)
                curveTo(3.628f, 15.005f, 4.0f, 15.606f, 4.0f, 16.264f)
                verticalLineTo(16.5f)
                curveTo(4.0f, 17.328f, 3.328f, 18.0f, 2.5f, 18.0f)
                curveTo(1.672f, 18.0f, 1.0f, 17.328f, 1.0f, 16.5f)
                curveTo(1.0f, 16.224f, 1.224f, 16.0f, 1.5f, 16.0f)
                curveTo(1.776f, 16.0f, 2.0f, 16.224f, 2.0f, 16.5f)
                curveTo(2.0f, 16.776f, 2.224f, 17.0f, 2.5f, 17.0f)
                curveTo(2.776f, 17.0f, 3.0f, 16.776f, 3.0f, 16.5f)
                verticalLineTo(16.264f)
                curveTo(3.0f, 15.985f, 2.842f, 15.73f, 2.593f, 15.606f)
                lineTo(1.96f, 15.289f)
                curveTo(1.372f, 14.995f, 1.0f, 14.394f, 1.0f, 13.736f)
                verticalLineTo(13.5f)
                curveTo(1.0f, 12.672f, 1.672f, 12.0f, 2.5f, 12.0f)
                curveTo(3.328f, 12.0f, 4.0f, 12.672f, 4.0f, 13.5f)
                curveTo(4.0f, 13.776f, 3.776f, 14.0f, 3.5f, 14.0f)
                curveTo(3.224f, 14.0f, 3.0f, 13.776f, 3.0f, 13.5f)
                curveTo(3.0f, 13.224f, 2.776f, 13.0f, 2.5f, 13.0f)
                close()
                moveTo(7.472f, 12.335f)
                curveTo(7.402f, 12.134f, 7.212f, 12.0f, 7.0f, 12.0f)
                curveTo(6.788f, 12.0f, 6.598f, 12.134f, 6.528f, 12.335f)
                lineTo(4.778f, 17.335f)
                curveTo(4.687f, 17.596f, 4.824f, 17.881f, 5.085f, 17.972f)
                curveTo(5.345f, 18.063f, 5.631f, 17.926f, 5.722f, 17.665f)
                lineTo(5.955f, 17.0f)
                horizontalLineTo(8.045f)
                lineTo(8.278f, 17.665f)
                curveTo(8.369f, 17.926f, 8.655f, 18.063f, 8.915f, 17.972f)
                curveTo(9.176f, 17.881f, 9.313f, 17.596f, 9.222f, 17.335f)
                lineTo(7.472f, 12.335f)
                close()
                moveTo(7.695f, 16.0f)
                horizontalLineTo(6.305f)
                lineTo(7.0f, 14.014f)
                lineTo(7.695f, 16.0f)
                close()
                moveTo(11.0f, 13.5f)
                curveTo(11.0f, 13.224f, 11.224f, 13.0f, 11.5f, 13.0f)
                curveTo(11.776f, 13.0f, 12.0f, 13.224f, 12.0f, 13.5f)
                curveTo(12.0f, 13.776f, 12.224f, 14.0f, 12.5f, 14.0f)
                curveTo(12.776f, 14.0f, 13.0f, 13.776f, 13.0f, 13.5f)
                curveTo(13.0f, 12.672f, 12.328f, 12.0f, 11.5f, 12.0f)
                curveTo(10.672f, 12.0f, 10.0f, 12.672f, 10.0f, 13.5f)
                verticalLineTo(13.736f)
                curveTo(10.0f, 14.394f, 10.372f, 14.995f, 10.96f, 15.289f)
                lineTo(11.593f, 15.606f)
                curveTo(11.842f, 15.73f, 12.0f, 15.985f, 12.0f, 16.264f)
                verticalLineTo(16.5f)
                curveTo(12.0f, 16.776f, 11.776f, 17.0f, 11.5f, 17.0f)
                curveTo(11.224f, 17.0f, 11.0f, 16.776f, 11.0f, 16.5f)
                curveTo(11.0f, 16.224f, 10.776f, 16.0f, 10.5f, 16.0f)
                curveTo(10.224f, 16.0f, 10.0f, 16.224f, 10.0f, 16.5f)
                curveTo(10.0f, 17.328f, 10.672f, 18.0f, 11.5f, 18.0f)
                curveTo(12.328f, 18.0f, 13.0f, 17.328f, 13.0f, 16.5f)
                verticalLineTo(16.264f)
                curveTo(13.0f, 15.606f, 12.628f, 15.005f, 12.04f, 14.711f)
                lineTo(11.407f, 14.394f)
                curveTo(11.158f, 14.27f, 11.0f, 14.015f, 11.0f, 13.736f)
                verticalLineTo(13.5f)
                close()
                moveTo(15.5f, 13.0f)
                curveTo(15.224f, 13.0f, 15.0f, 13.224f, 15.0f, 13.5f)
                verticalLineTo(13.736f)
                curveTo(15.0f, 14.015f, 15.158f, 14.27f, 15.407f, 14.394f)
                lineTo(16.04f, 14.711f)
                curveTo(16.628f, 15.005f, 17.0f, 15.606f, 17.0f, 16.264f)
                verticalLineTo(16.5f)
                curveTo(17.0f, 17.328f, 16.328f, 18.0f, 15.5f, 18.0f)
                curveTo(14.672f, 18.0f, 14.0f, 17.328f, 14.0f, 16.5f)
                curveTo(14.0f, 16.224f, 14.224f, 16.0f, 14.5f, 16.0f)
                curveTo(14.776f, 16.0f, 15.0f, 16.224f, 15.0f, 16.5f)
                curveTo(15.0f, 16.776f, 15.224f, 17.0f, 15.5f, 17.0f)
                curveTo(15.776f, 17.0f, 16.0f, 16.776f, 16.0f, 16.5f)
                verticalLineTo(16.264f)
                curveTo(16.0f, 15.985f, 15.842f, 15.73f, 15.593f, 15.606f)
                lineTo(14.96f, 15.289f)
                curveTo(14.372f, 14.995f, 14.0f, 14.394f, 14.0f, 13.736f)
                verticalLineTo(13.5f)
                curveTo(14.0f, 12.672f, 14.672f, 12.0f, 15.5f, 12.0f)
                curveTo(16.328f, 12.0f, 17.0f, 12.672f, 17.0f, 13.5f)
                curveTo(17.0f, 13.776f, 16.776f, 14.0f, 16.5f, 14.0f)
                curveTo(16.224f, 14.0f, 16.0f, 13.776f, 16.0f, 13.5f)
                curveTo(16.0f, 13.224f, 15.776f, 13.0f, 15.5f, 13.0f)
                close()
            }
        }
        .build()
        return _documentSass!!
    }

@Suppress("ObjectPropertyName")
private var _documentSass: ImageVector? = null

@Preview
@Composable
private fun DocumentSassPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentSass, contentDescription = null)
    }
}

