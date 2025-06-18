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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.StackOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.StackOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(3.135f, 4.196f)
            curveTo(2.464f, 4.519f, 2f, 5.205f, 2f, 6f)
            verticalLineTo(13f)
            curveTo(2f, 14.105f, 2.895f, 15f, 4f, 15f)
            horizontalLineTo(13.939f)
            lineTo(14.939f, 16f)
            horizontalLineTo(4.563f)
            curveTo(4.785f, 16.863f, 5.568f, 17.5f, 6.5f, 17.5f)
            horizontalLineTo(15.5f)
            curveTo(15.791f, 17.5f, 16.075f, 17.469f, 16.349f, 17.41f)
            lineTo(17.307f, 18.368f)
            curveTo(16.969f, 18.454f, 16.615f, 18.5f, 16.25f, 18.5f)
            horizontalLineTo(7.063f)
            curveTo(7.285f, 19.363f, 8.068f, 20f, 9f, 20f)
            horizontalLineTo(16.25f)
            curveTo(17.044f, 20f, 17.8f, 19.839f, 18.487f, 19.548f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(17.757f, 14.576f)
            lineTo(18.857f, 15.675f)
            curveTo(19.264f, 15.049f, 19.5f, 14.302f, 19.5f, 13.5f)
            verticalLineTo(8.5f)
            curveTo(19.5f, 7.568f, 18.863f, 6.785f, 18f, 6.563f)
            verticalLineTo(13.5f)
            curveTo(18f, 13.885f, 17.913f, 14.25f, 17.757f, 14.576f)
            close()
            moveTo(19.788f, 16.606f)
            lineTo(20.864f, 17.682f)
            curveTo(21.578f, 16.724f, 22f, 15.536f, 22f, 14.25f)
            verticalLineTo(11f)
            curveTo(22f, 10.068f, 21.363f, 9.285f, 20.5f, 9.063f)
            verticalLineTo(14.25f)
            curveTo(20.5f, 15.121f, 20.238f, 15.932f, 19.788f, 16.606f)
            close()
            moveTo(7.182f, 4f)
            lineTo(16.876f, 13.694f)
            curveTo(16.956f, 13.478f, 17f, 13.244f, 17f, 13f)
            verticalLineTo(6f)
            curveTo(17f, 4.895f, 16.105f, 4f, 15f, 4f)
            horizontalLineTo(7.182f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StackOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.StackOff, contentDescription = null)
    }
}
