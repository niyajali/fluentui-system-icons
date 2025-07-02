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
 * DocumentArrowUp icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: document, arrow, up
 * - Source: ic_fluent_document_arrow_up_20_regular.svg
 * 
 * @return The [ImageVector] for the DocumentArrowUp icon.
 */
public val FluentIcons.Regular.DocumentArrowUp: ImageVector
    get() {
        if (_documentArrowUp != null) {
            return _documentArrowUp!!
        }
        _documentArrowUp = Builder(name = "DocumentArrowUp", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                curveTo(4.895f, 2.0f, 4.0f, 2.895f, 4.0f, 4.0f)
                verticalLineTo(9.207f)
                curveTo(4.322f, 9.116f, 4.657f, 9.053f, 5.0f, 9.022f)
                verticalLineTo(4.0f)
                curveTo(5.0f, 3.448f, 5.448f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 7.328f, 10.672f, 8.0f, 11.5f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                curveTo(15.0f, 16.552f, 14.552f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(10.4f)
                curveTo(10.217f, 17.358f, 9.996f, 17.693f, 9.743f, 18.0f)
                horizontalLineTo(14.0f)
                curveTo(15.105f, 18.0f, 16.0f, 17.105f, 16.0f, 16.0f)
                verticalLineTo(7.414f)
                curveTo(16.0f, 7.016f, 15.842f, 6.635f, 15.561f, 6.354f)
                lineTo(11.646f, 2.439f)
                curveTo(11.365f, 2.158f, 10.984f, 2.0f, 10.586f, 2.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(14.793f, 7.0f)
                horizontalLineTo(11.5f)
                curveTo(11.224f, 7.0f, 11.0f, 6.776f, 11.0f, 6.5f)
                verticalLineTo(3.207f)
                lineTo(14.793f, 7.0f)
                close()
                moveTo(5.5f, 19.0f)
                curveTo(7.985f, 19.0f, 10.0f, 16.985f, 10.0f, 14.5f)
                curveTo(10.0f, 12.015f, 7.985f, 10.0f, 5.5f, 10.0f)
                curveTo(3.015f, 10.0f, 1.0f, 12.015f, 1.0f, 14.5f)
                curveTo(1.0f, 16.985f, 3.015f, 19.0f, 5.5f, 19.0f)
                close()
                moveTo(7.854f, 14.146f)
                curveTo(8.049f, 14.342f, 8.049f, 14.658f, 7.854f, 14.854f)
                curveTo(7.658f, 15.049f, 7.342f, 15.049f, 7.146f, 14.854f)
                lineTo(6.0f, 13.707f)
                lineTo(6.0f, 16.5f)
                curveTo(6.0f, 16.776f, 5.776f, 17.0f, 5.5f, 17.0f)
                curveTo(5.224f, 17.0f, 5.0f, 16.776f, 5.0f, 16.5f)
                lineTo(5.0f, 13.707f)
                lineTo(3.854f, 14.854f)
                curveTo(3.658f, 15.049f, 3.342f, 15.049f, 3.146f, 14.854f)
                curveTo(2.951f, 14.658f, 2.951f, 14.342f, 3.146f, 14.146f)
                lineTo(5.146f, 12.146f)
                curveTo(5.194f, 12.099f, 5.25f, 12.062f, 5.309f, 12.038f)
                curveTo(5.367f, 12.014f, 5.43f, 12.0f, 5.497f, 12.0f)
                lineTo(5.5f, 12.0f)
                lineTo(5.503f, 12.0f)
                curveTo(5.57f, 12.0f, 5.633f, 12.014f, 5.691f, 12.038f)
                curveTo(5.749f, 12.062f, 5.804f, 12.097f, 5.851f, 12.144f)
                lineTo(5.854f, 12.147f)
                lineTo(7.854f, 14.146f)
                close()
            }
        }
        .build()
        return _documentArrowUp!!
    }

@Suppress("ObjectPropertyName")
private var _documentArrowUp: ImageVector? = null

@Preview
@Composable
private fun DocumentArrowUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentArrowUp, contentDescription = null)
    }
}

