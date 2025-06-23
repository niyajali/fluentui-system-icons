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
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.TextPositionSquareLeft: ImageVector
    get() {
        if (_TextPositionSquareLeft != null) {
            return _TextPositionSquareLeft!!
        }
        _TextPositionSquareLeft = ImageVector.Builder(
            name = "Filled.TextPositionSquareLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.75f, 3.75f)
                curveTo(3.198f, 3.75f, 2.75f, 4.198f, 2.75f, 4.75f)
                curveTo(2.75f, 5.302f, 3.198f, 5.75f, 3.75f, 5.75f)
                horizontalLineTo(20.25f)
                curveTo(20.802f, 5.75f, 21.25f, 5.302f, 21.25f, 4.75f)
                curveTo(21.25f, 4.198f, 20.802f, 3.75f, 20.25f, 3.75f)
                horizontalLineTo(3.75f)
                close()
                moveTo(13.25f, 7.25f)
                curveTo(12.698f, 7.25f, 12.25f, 7.698f, 12.25f, 8.25f)
                curveTo(12.25f, 8.802f, 12.698f, 9.25f, 13.25f, 9.25f)
                horizontalLineTo(20.25f)
                curveTo(20.802f, 9.25f, 21.25f, 8.802f, 21.25f, 8.25f)
                curveTo(21.25f, 7.698f, 20.802f, 7.25f, 20.25f, 7.25f)
                horizontalLineTo(13.25f)
                close()
                moveTo(12.25f, 15.25f)
                curveTo(12.25f, 14.698f, 12.698f, 14.25f, 13.25f, 14.25f)
                horizontalLineTo(20.25f)
                curveTo(20.802f, 14.25f, 21.25f, 14.698f, 21.25f, 15.25f)
                curveTo(21.25f, 15.802f, 20.802f, 16.25f, 20.25f, 16.25f)
                horizontalLineTo(13.25f)
                curveTo(12.698f, 16.25f, 12.25f, 15.802f, 12.25f, 15.25f)
                close()
                moveTo(13.25f, 10.75f)
                curveTo(12.698f, 10.75f, 12.25f, 11.198f, 12.25f, 11.75f)
                curveTo(12.25f, 12.302f, 12.698f, 12.75f, 13.25f, 12.75f)
                horizontalLineTo(20.25f)
                curveTo(20.802f, 12.75f, 21.25f, 12.302f, 21.25f, 11.75f)
                curveTo(21.25f, 11.198f, 20.802f, 10.75f, 20.25f, 10.75f)
                horizontalLineTo(13.25f)
                close()
                moveTo(2.75f, 18.75f)
                curveTo(2.75f, 18.198f, 3.198f, 17.75f, 3.75f, 17.75f)
                horizontalLineTo(20.25f)
                curveTo(20.802f, 17.75f, 21.25f, 18.198f, 21.25f, 18.75f)
                curveTo(21.25f, 19.302f, 20.802f, 19.75f, 20.25f, 19.75f)
                horizontalLineTo(3.75f)
                curveTo(3.198f, 19.75f, 2.75f, 19.302f, 2.75f, 18.75f)
                close()
                moveTo(4.75f, 11f)
                curveTo(4.75f, 9.757f, 5.757f, 8.75f, 7f, 8.75f)
                curveTo(8.243f, 8.75f, 9.25f, 9.757f, 9.25f, 11f)
                verticalLineTo(15.75f)
                curveTo(9.25f, 16.302f, 9.698f, 16.75f, 10.25f, 16.75f)
                curveTo(10.802f, 16.75f, 11.25f, 16.302f, 11.25f, 15.75f)
                verticalLineTo(11f)
                curveTo(11.25f, 8.653f, 9.347f, 6.75f, 7f, 6.75f)
                curveTo(4.653f, 6.75f, 2.75f, 8.653f, 2.75f, 11f)
                verticalLineTo(15.75f)
                curveTo(2.75f, 16.302f, 3.198f, 16.75f, 3.75f, 16.75f)
                curveTo(4.302f, 16.75f, 4.75f, 16.302f, 4.75f, 15.75f)
                verticalLineTo(11f)
                close()
            }
        }.build()

        return _TextPositionSquareLeft!!
    }

@Suppress("ObjectPropertyName")
private var _TextPositionSquareLeft: ImageVector? = null

@Preview
@Composable
private fun TextPositionSquareLeftPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TextPositionSquareLeft, contentDescription = null)
    }
}
