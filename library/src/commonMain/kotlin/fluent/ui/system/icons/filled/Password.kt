/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.Password: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Password",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.249f, 5f)
            curveTo(3.454f, 5f, 2f, 6.455f, 2f, 8.25f)
            verticalLineTo(15.75f)
            curveTo(2f, 17.545f, 3.455f, 19f, 5.25f, 19f)
            horizontalLineTo(18.75f)
            curveTo(20.545f, 19f, 22f, 17.545f, 22f, 15.75f)
            verticalLineTo(8.25f)
            curveTo(22f, 6.455f, 20.546f, 5f, 18.751f, 5f)
            horizontalLineTo(5.249f)
            close()
            moveTo(6.28f, 10.219f)
            lineTo(7f, 10.939f)
            lineTo(7.72f, 10.22f)
            curveTo(8.013f, 9.927f, 8.487f, 9.927f, 8.78f, 10.22f)
            curveTo(9.073f, 10.513f, 9.073f, 10.987f, 8.78f, 11.28f)
            lineTo(8.061f, 12f)
            lineTo(8.78f, 12.718f)
            curveTo(9.073f, 13.011f, 9.073f, 13.486f, 8.78f, 13.779f)
            curveTo(8.488f, 14.072f, 8.013f, 14.072f, 7.72f, 13.779f)
            lineTo(7f, 13.06f)
            lineTo(6.28f, 13.78f)
            curveTo(5.987f, 14.073f, 5.513f, 14.073f, 5.22f, 13.78f)
            curveTo(4.927f, 13.487f, 4.927f, 13.013f, 5.22f, 12.72f)
            lineTo(5.94f, 12f)
            lineTo(5.22f, 11.281f)
            curveTo(4.927f, 10.988f, 4.927f, 10.513f, 5.22f, 10.22f)
            curveTo(5.512f, 9.927f, 5.987f, 9.927f, 6.28f, 10.219f)
            close()
            moveTo(11.78f, 10.219f)
            lineTo(12.5f, 10.939f)
            lineTo(13.22f, 10.22f)
            curveTo(13.513f, 9.927f, 13.987f, 9.927f, 14.28f, 10.22f)
            curveTo(14.573f, 10.513f, 14.573f, 10.987f, 14.28f, 11.28f)
            lineTo(13.561f, 12f)
            lineTo(14.28f, 12.718f)
            curveTo(14.573f, 13.011f, 14.573f, 13.486f, 14.281f, 13.779f)
            curveTo(13.988f, 14.072f, 13.513f, 14.072f, 13.22f, 13.779f)
            lineTo(12.5f, 13.06f)
            lineTo(11.78f, 13.78f)
            curveTo(11.487f, 14.073f, 11.013f, 14.073f, 10.72f, 13.78f)
            curveTo(10.427f, 13.487f, 10.427f, 13.013f, 10.72f, 12.72f)
            lineTo(11.439f, 12f)
            lineTo(10.72f, 11.281f)
            curveTo(10.427f, 10.988f, 10.427f, 10.513f, 10.719f, 10.22f)
            curveTo(11.012f, 9.927f, 11.487f, 9.927f, 11.78f, 10.219f)
            close()
            moveTo(15.75f, 13.25f)
            curveTo(15.75f, 12.836f, 16.086f, 12.5f, 16.5f, 12.5f)
            horizontalLineTo(18.25f)
            curveTo(18.664f, 12.5f, 19f, 12.836f, 19f, 13.25f)
            curveTo(19f, 13.664f, 18.664f, 14f, 18.25f, 14f)
            horizontalLineTo(16.5f)
            curveTo(16.086f, 14f, 15.75f, 13.664f, 15.75f, 13.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PasswordPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Password, contentDescription = null)
    }
}
