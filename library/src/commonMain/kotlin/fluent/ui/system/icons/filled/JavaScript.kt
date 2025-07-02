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
 * JavaScript icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 24dp
 * - Keywords: java, script
 * - Source: ic_fluent_javascript_24_filled.svg
 * 
 * @return The [ImageVector] for the JavaScript icon.
 */
public val FluentIcons.Filled.JavaScript: ImageVector
    get() {
        if (_javaScript != null) {
            return _javaScript!!
        }
        _javaScript = Builder(name = "JavaScript", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.545f, 4.455f, 21.0f, 6.25f, 21.0f)
                horizontalLineTo(17.75f)
                curveTo(19.545f, 21.0f, 21.0f, 19.545f, 21.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(21.0f, 4.455f, 19.545f, 3.0f, 17.75f, 3.0f)
                horizontalLineTo(6.25f)
                curveTo(4.455f, 3.0f, 3.0f, 4.455f, 3.0f, 6.25f)
                close()
                moveTo(12.0f, 9.5f)
                curveTo(12.414f, 9.5f, 12.75f, 9.836f, 12.75f, 10.25f)
                verticalLineTo(16.25f)
                curveTo(12.75f, 17.216f, 11.967f, 18.0f, 11.0f, 18.0f)
                horizontalLineTo(9.75f)
                curveTo(9.336f, 18.0f, 9.0f, 17.664f, 9.0f, 17.25f)
                curveTo(9.0f, 16.836f, 9.336f, 16.5f, 9.75f, 16.5f)
                horizontalLineTo(11.0f)
                curveTo(11.138f, 16.5f, 11.25f, 16.388f, 11.25f, 16.25f)
                verticalLineTo(10.25f)
                curveTo(11.25f, 9.836f, 11.586f, 9.5f, 12.0f, 9.5f)
                close()
                moveTo(14.0f, 11.25f)
                curveTo(14.0f, 10.283f, 14.783f, 9.5f, 15.75f, 9.5f)
                horizontalLineTo(17.25f)
                curveTo(17.664f, 9.5f, 18.0f, 9.836f, 18.0f, 10.25f)
                curveTo(18.0f, 10.664f, 17.664f, 11.0f, 17.25f, 11.0f)
                horizontalLineTo(15.75f)
                curveTo(15.612f, 11.0f, 15.5f, 11.112f, 15.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(15.5f, 12.888f, 15.612f, 13.0f, 15.75f, 13.0f)
                horizontalLineTo(16.25f)
                curveTo(17.216f, 13.0f, 18.0f, 13.783f, 18.0f, 14.75f)
                verticalLineTo(16.25f)
                curveTo(18.0f, 17.216f, 17.216f, 18.0f, 16.25f, 18.0f)
                horizontalLineTo(14.75f)
                curveTo(14.336f, 18.0f, 14.0f, 17.664f, 14.0f, 17.25f)
                curveTo(14.0f, 16.836f, 14.336f, 16.5f, 14.75f, 16.5f)
                horizontalLineTo(16.25f)
                curveTo(16.388f, 16.5f, 16.5f, 16.388f, 16.5f, 16.25f)
                verticalLineTo(14.75f)
                curveTo(16.5f, 14.612f, 16.388f, 14.5f, 16.25f, 14.5f)
                horizontalLineTo(15.75f)
                curveTo(14.783f, 14.5f, 14.0f, 13.717f, 14.0f, 12.75f)
                verticalLineTo(11.25f)
                close()
            }
        }
        .build()
        return _javaScript!!
    }

@Suppress("ObjectPropertyName")
private var _javaScript: ImageVector? = null

@Preview
@Composable
private fun JavaScriptPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.JavaScript, contentDescription = null)
    }
}

