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

public val FluentIcons.Regular.DialpadOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DialpadOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(6.721f, 7.782f)
            curveTo(6.167f, 7.91f, 5.754f, 8.407f, 5.754f, 9f)
            curveTo(5.754f, 9.69f, 6.314f, 10.25f, 7.004f, 10.25f)
            curveTo(7.597f, 10.25f, 8.094f, 9.837f, 8.222f, 9.283f)
            lineTo(11.72f, 12.781f)
            curveTo(11.165f, 12.908f, 10.75f, 13.406f, 10.75f, 14f)
            curveTo(10.75f, 14.69f, 11.31f, 15.25f, 12f, 15.25f)
            curveTo(12.594f, 15.25f, 13.092f, 14.835f, 13.219f, 14.28f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(18.246f, 14f)
            curveTo(18.246f, 14.298f, 18.142f, 14.571f, 17.968f, 14.786f)
            lineTo(16.21f, 13.028f)
            curveTo(16.425f, 12.854f, 16.698f, 12.75f, 16.996f, 12.75f)
            curveTo(17.686f, 12.75f, 18.246f, 13.31f, 18.246f, 14f)
            close()
            moveTo(13.25f, 9f)
            curveTo(13.25f, 9.299f, 13.145f, 9.573f, 12.97f, 9.788f)
            lineTo(11.212f, 8.03f)
            curveTo(11.427f, 7.855f, 11.701f, 7.75f, 12f, 7.75f)
            curveTo(12.69f, 7.75f, 13.25f, 8.31f, 13.25f, 9f)
            close()
            moveTo(8.254f, 4f)
            curveTo(8.254f, 4.3f, 8.148f, 4.575f, 7.972f, 4.79f)
            lineTo(6.214f, 3.032f)
            curveTo(6.429f, 2.856f, 6.704f, 2.75f, 7.004f, 2.75f)
            curveTo(7.694f, 2.75f, 8.254f, 3.31f, 8.254f, 4f)
            close()
            moveTo(12f, 17.75f)
            curveTo(12.69f, 17.75f, 13.25f, 18.31f, 13.25f, 19f)
            curveTo(13.25f, 19.69f, 12.69f, 20.25f, 12f, 20.25f)
            curveTo(11.31f, 20.25f, 10.75f, 19.69f, 10.75f, 19f)
            curveTo(10.75f, 18.31f, 11.31f, 17.75f, 12f, 17.75f)
            close()
            moveTo(7.004f, 12.75f)
            curveTo(7.694f, 12.75f, 8.254f, 13.31f, 8.254f, 14f)
            curveTo(8.254f, 14.69f, 7.694f, 15.25f, 7.004f, 15.25f)
            curveTo(6.314f, 15.25f, 5.754f, 14.69f, 5.754f, 14f)
            curveTo(5.754f, 13.31f, 6.314f, 12.75f, 7.004f, 12.75f)
            close()
            moveTo(16.996f, 7.75f)
            curveTo(17.686f, 7.75f, 18.246f, 8.31f, 18.246f, 9f)
            curveTo(18.246f, 9.69f, 17.686f, 10.25f, 16.996f, 10.25f)
            curveTo(16.306f, 10.25f, 15.746f, 9.69f, 15.746f, 9f)
            curveTo(15.746f, 8.31f, 16.306f, 7.75f, 16.996f, 7.75f)
            close()
            moveTo(12f, 2.75f)
            curveTo(12.69f, 2.75f, 13.25f, 3.31f, 13.25f, 4f)
            curveTo(13.25f, 4.69f, 12.69f, 5.25f, 12f, 5.25f)
            curveTo(11.31f, 5.25f, 10.75f, 4.69f, 10.75f, 4f)
            curveTo(10.75f, 3.31f, 11.31f, 2.75f, 12f, 2.75f)
            close()
            moveTo(16.996f, 2.75f)
            curveTo(17.686f, 2.75f, 18.246f, 3.31f, 18.246f, 4f)
            curveTo(18.246f, 4.69f, 17.686f, 5.25f, 16.996f, 5.25f)
            curveTo(16.306f, 5.25f, 15.746f, 4.69f, 15.746f, 4f)
            curveTo(15.746f, 3.31f, 16.306f, 2.75f, 16.996f, 2.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DialpadOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DialpadOff, contentDescription = null)
    }
}
