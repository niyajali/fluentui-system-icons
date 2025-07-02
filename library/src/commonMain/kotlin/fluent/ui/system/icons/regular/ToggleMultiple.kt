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
 * ToggleMultiple icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: toggle, multiple
 * - Source: ic_fluent_toggle_multiple_24_regular.svg
 * 
 * @return The [ImageVector] for the ToggleMultiple icon.
 */
public val FluentIcons.Regular.ToggleMultiple: ImageVector
    get() {
        if (_toggleMultiple != null) {
            return _toggleMultiple!!
        }
        _toggleMultiple = Builder(name = "ToggleMultiple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.5f, 8.5f)
                curveTo(7.605f, 8.5f, 8.5f, 7.605f, 8.5f, 6.5f)
                curveTo(8.5f, 5.395f, 7.605f, 4.5f, 6.5f, 4.5f)
                curveTo(5.395f, 4.5f, 4.5f, 5.395f, 4.5f, 6.5f)
                curveTo(4.5f, 7.605f, 5.395f, 8.5f, 6.5f, 8.5f)
                close()
                moveTo(6.5f, 2.0f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 2.0f, 22.0f, 4.015f, 22.0f, 6.5f)
                curveTo(22.0f, 8.985f, 19.985f, 11.0f, 17.5f, 11.0f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 11.0f, 2.0f, 8.985f, 2.0f, 6.5f)
                curveTo(2.0f, 4.015f, 4.015f, 2.0f, 6.5f, 2.0f)
                close()
                moveTo(17.5f, 3.5f)
                horizontalLineTo(6.5f)
                curveTo(4.843f, 3.5f, 3.5f, 4.843f, 3.5f, 6.5f)
                curveTo(3.5f, 8.157f, 4.843f, 9.5f, 6.5f, 9.5f)
                horizontalLineTo(17.5f)
                curveTo(19.157f, 9.5f, 20.5f, 8.157f, 20.5f, 6.5f)
                curveTo(20.5f, 4.843f, 19.157f, 3.5f, 17.5f, 3.5f)
                close()
                moveTo(17.5f, 19.5f)
                curveTo(18.605f, 19.5f, 19.5f, 18.605f, 19.5f, 17.5f)
                curveTo(19.5f, 16.395f, 18.605f, 15.5f, 17.5f, 15.5f)
                curveTo(16.395f, 15.5f, 15.5f, 16.395f, 15.5f, 17.5f)
                curveTo(15.5f, 18.605f, 16.395f, 19.5f, 17.5f, 19.5f)
                close()
                moveTo(2.0f, 17.5f)
                curveTo(2.0f, 15.015f, 4.015f, 13.0f, 6.5f, 13.0f)
                horizontalLineTo(17.5f)
                curveTo(19.985f, 13.0f, 22.0f, 15.015f, 22.0f, 17.5f)
                curveTo(22.0f, 19.985f, 19.985f, 22.0f, 17.5f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(4.015f, 22.0f, 2.0f, 19.985f, 2.0f, 17.5f)
                close()
                moveTo(6.5f, 14.5f)
                curveTo(4.843f, 14.5f, 3.5f, 15.843f, 3.5f, 17.5f)
                curveTo(3.5f, 19.157f, 4.843f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(17.5f)
                curveTo(19.157f, 20.5f, 20.5f, 19.157f, 20.5f, 17.5f)
                curveTo(20.5f, 15.843f, 19.157f, 14.5f, 17.5f, 14.5f)
                horizontalLineTo(6.5f)
                close()
            }
        }
        .build()
        return _toggleMultiple!!
    }

@Suppress("ObjectPropertyName")
private var _toggleMultiple: ImageVector? = null

@Preview
@Composable
private fun ToggleMultiplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ToggleMultiple, contentDescription = null)
    }
}

