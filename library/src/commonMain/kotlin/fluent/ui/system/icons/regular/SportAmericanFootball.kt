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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.SportAmericanFootball: ImageVector
    get() {
        if (_SportAmericanFootball != null) {
            return _SportAmericanFootball!!
        }
        _SportAmericanFootball = ImageVector.Builder(
            name = "Regular.SportAmericanFootball",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.72f, 9.22f)
                curveTo(14.013f, 8.927f, 14.487f, 8.927f, 14.78f, 9.22f)
                curveTo(15.073f, 9.513f, 15.073f, 9.987f, 14.78f, 10.28f)
                lineTo(10.28f, 14.78f)
                curveTo(9.987f, 15.073f, 9.513f, 15.073f, 9.22f, 14.78f)
                curveTo(8.927f, 14.487f, 8.927f, 14.013f, 9.22f, 13.72f)
                lineTo(13.72f, 9.22f)
                close()
                moveTo(17.75f, 2f)
                curveTo(20.097f, 2f, 22f, 3.903f, 22f, 6.25f)
                verticalLineTo(7.25f)
                curveTo(22f, 15.396f, 15.396f, 22f, 7.25f, 22f)
                horizontalLineTo(6.25f)
                curveTo(3.903f, 22f, 2f, 20.097f, 2f, 17.75f)
                verticalLineTo(16.75f)
                curveTo(2f, 8.604f, 8.604f, 2f, 16.75f, 2f)
                horizontalLineTo(17.75f)
                close()
                moveTo(20.5f, 6.25f)
                curveTo(20.5f, 4.731f, 19.269f, 3.5f, 17.75f, 3.5f)
                horizontalLineTo(16.75f)
                curveTo(16.347f, 3.5f, 15.948f, 3.518f, 15.554f, 3.553f)
                lineTo(20.447f, 8.446f)
                curveTo(20.482f, 8.052f, 20.5f, 7.653f, 20.5f, 7.25f)
                verticalLineTo(6.25f)
                close()
                moveTo(20.153f, 10.274f)
                lineTo(13.726f, 3.847f)
                curveTo(8.804f, 4.996f, 4.937f, 8.888f, 3.824f, 13.824f)
                lineTo(10.176f, 20.176f)
                curveTo(15.112f, 19.063f, 19.004f, 15.196f, 20.153f, 10.274f)
                close()
                moveTo(3.544f, 15.665f)
                curveTo(3.515f, 16.023f, 3.5f, 16.385f, 3.5f, 16.75f)
                verticalLineTo(17.75f)
                curveTo(3.5f, 19.269f, 4.731f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(7.25f)
                curveTo(7.615f, 20.5f, 7.977f, 20.485f, 8.335f, 20.456f)
                lineTo(3.544f, 15.665f)
                close()
            }
        }.build()

        return _SportAmericanFootball!!
    }

@Suppress("ObjectPropertyName")
private var _SportAmericanFootball: ImageVector? = null

@Preview
@Composable
private fun SportAmericanFootballPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SportAmericanFootball, contentDescription = null)
    }
}
