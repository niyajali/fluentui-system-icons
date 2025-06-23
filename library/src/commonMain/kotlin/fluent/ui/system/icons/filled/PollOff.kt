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

public val FluentIcons.Filled.PollOff: ImageVector
    get() {
        if (_PollOff != null) {
            return _PollOff!!
        }
        _PollOff = ImageVector.Builder(
            name = "Filled.PollOff",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(9f, 10.061f)
                verticalLineTo(19.25f)
                curveTo(9f, 20.77f, 10.232f, 22.002f, 11.752f, 22.002f)
                curveTo(13.272f, 22.002f, 14.504f, 20.77f, 14.504f, 19.25f)
                verticalLineTo(15.565f)
                lineTo(16f, 17.061f)
                verticalLineTo(19.25f)
                curveTo(16f, 20.77f, 17.232f, 22.002f, 18.752f, 22.002f)
                curveTo(19.368f, 22.002f, 19.937f, 21.799f, 20.396f, 21.457f)
                lineTo(20.719f, 21.781f)
                curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
                curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
                lineTo(3.28f, 2.22f)
                curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
                curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
                lineTo(9f, 10.061f)
                close()
                moveTo(16f, 12.818f)
                lineTo(21.504f, 18.322f)
                verticalLineTo(9.751f)
                curveTo(21.504f, 8.232f, 20.272f, 7f, 18.752f, 7f)
                curveTo(17.232f, 7f, 16f, 8.232f, 16f, 9.751f)
                verticalLineTo(12.818f)
                close()
                moveTo(9f, 5.818f)
                lineTo(14.504f, 11.322f)
                verticalLineTo(4.751f)
                curveTo(14.504f, 3.232f, 13.272f, 2f, 11.752f, 2f)
                curveTo(10.232f, 2f, 9f, 3.232f, 9f, 4.751f)
                verticalLineTo(5.818f)
                close()
                moveTo(4.752f, 12f)
                curveTo(6.272f, 12f, 7.504f, 13.232f, 7.504f, 14.751f)
                verticalLineTo(19.25f)
                curveTo(7.504f, 20.77f, 6.272f, 22.002f, 4.752f, 22.002f)
                curveTo(3.232f, 22.002f, 2f, 20.77f, 2f, 19.25f)
                verticalLineTo(14.751f)
                curveTo(2f, 13.232f, 3.232f, 12f, 4.752f, 12f)
                close()
            }
        }.build()

        return _PollOff!!
    }

@Suppress("ObjectPropertyName")
private var _PollOff: ImageVector? = null

@Preview
@Composable
private fun PollOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PollOff, contentDescription = null)
    }
}
