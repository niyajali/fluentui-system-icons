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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.FlashlightOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlashlightOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.53f, 14.47f)
            curveTo(9.823f, 14.763f, 9.823f, 15.237f, 9.53f, 15.53f)
            lineTo(8.03f, 17.03f)
            curveTo(7.737f, 17.323f, 7.263f, 17.323f, 6.97f, 17.03f)
            curveTo(6.677f, 16.737f, 6.677f, 16.263f, 6.97f, 15.97f)
            lineTo(8.47f, 14.47f)
            curveTo(8.763f, 14.177f, 9.237f, 14.177f, 9.53f, 14.47f)
            close()
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(8.25f, 9.311f)
            verticalLineTo(10.689f)
            lineTo(3.03f, 15.909f)
            curveTo(2.151f, 16.788f, 2.151f, 18.212f, 3.03f, 19.091f)
            lineTo(4.909f, 20.97f)
            curveTo(5.787f, 21.848f, 7.212f, 21.848f, 8.091f, 20.97f)
            lineTo(13.31f, 15.75f)
            horizontalLineTo(14.689f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(9f, 12.061f)
            lineTo(11.939f, 15f)
            lineTo(7.03f, 19.909f)
            curveTo(6.737f, 20.202f, 6.262f, 20.202f, 5.969f, 19.909f)
            lineTo(4.091f, 18.03f)
            curveTo(3.798f, 17.737f, 3.798f, 17.263f, 4.091f, 16.97f)
            lineTo(9f, 12.061f)
            close()
            moveTo(17.844f, 14.095f)
            lineTo(19.409f, 12.53f)
            curveTo(19.702f, 12.237f, 19.702f, 11.763f, 19.409f, 11.47f)
            lineTo(12.53f, 4.591f)
            curveTo(12.237f, 4.298f, 11.762f, 4.298f, 11.469f, 4.591f)
            lineTo(9.905f, 6.155f)
            lineTo(8.844f, 5.095f)
            lineTo(10.409f, 3.53f)
            curveTo(11.288f, 2.652f, 12.712f, 2.652f, 13.591f, 3.53f)
            lineTo(20.469f, 10.409f)
            curveTo(21.348f, 11.288f, 21.348f, 12.712f, 20.469f, 13.591f)
            lineTo(18.905f, 15.156f)
            lineTo(17.844f, 14.095f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlashlightOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FlashlightOff, contentDescription = null)
    }
}
