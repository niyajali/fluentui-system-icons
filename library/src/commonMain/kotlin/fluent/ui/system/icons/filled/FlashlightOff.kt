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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.FlashlightOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlashlightOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(19.06f, 15f)
            lineTo(20.469f, 13.591f)
            curveTo(21.348f, 12.712f, 21.348f, 11.288f, 20.469f, 10.409f)
            lineTo(13.591f, 3.53f)
            curveTo(12.712f, 2.652f, 11.288f, 2.652f, 10.409f, 3.53f)
            lineTo(9f, 4.939f)
            lineTo(19.06f, 15f)
            close()
            moveTo(13f, 16.061f)
            lineTo(7.939f, 11f)
            lineTo(3.03f, 15.909f)
            curveTo(2.151f, 16.788f, 2.151f, 18.212f, 3.03f, 19.091f)
            lineTo(4.909f, 20.97f)
            curveTo(5.787f, 21.848f, 7.212f, 21.848f, 8.091f, 20.97f)
            lineTo(13f, 16.061f)
            close()
            moveTo(9.53f, 15.53f)
            lineTo(8.03f, 17.03f)
            curveTo(7.737f, 17.323f, 7.262f, 17.323f, 6.969f, 17.03f)
            curveTo(6.677f, 16.737f, 6.677f, 16.263f, 6.969f, 15.97f)
            lineTo(8.469f, 14.47f)
            curveTo(8.762f, 14.177f, 9.237f, 14.177f, 9.53f, 14.47f)
            curveTo(9.823f, 14.763f, 9.823f, 15.238f, 9.53f, 15.53f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlashlightOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.FlashlightOff, contentDescription = null)
    }
}
