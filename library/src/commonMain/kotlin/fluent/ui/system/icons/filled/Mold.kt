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

public val FluentUi.Filled.Mold: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Mold",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.25f, 2.25f)
            curveTo(16.25f, 1.836f, 15.914f, 1.5f, 15.5f, 1.5f)
            curveTo(15.086f, 1.5f, 14.75f, 1.836f, 14.75f, 2.25f)
            verticalLineTo(4.074f)
            curveTo(13.897f, 4.232f, 13.081f, 4.641f, 12.421f, 5.3f)
            lineTo(11.641f, 6.08f)
            lineTo(10.28f, 4.72f)
            curveTo(9.987f, 4.427f, 9.513f, 4.427f, 9.22f, 4.72f)
            curveTo(8.927f, 5.013f, 8.927f, 5.487f, 9.22f, 5.78f)
            lineTo(10.58f, 7.141f)
            lineTo(7.141f, 10.58f)
            lineTo(5.78f, 9.22f)
            curveTo(5.487f, 8.927f, 5.013f, 8.927f, 4.72f, 9.22f)
            curveTo(4.427f, 9.513f, 4.427f, 9.987f, 4.72f, 10.28f)
            lineTo(6.08f, 11.641f)
            lineTo(5.303f, 12.419f)
            curveTo(4.642f, 13.08f, 4.233f, 13.896f, 4.076f, 14.75f)
            horizontalLineTo(2.25f)
            curveTo(1.836f, 14.75f, 1.5f, 15.086f, 1.5f, 15.5f)
            curveTo(1.5f, 15.914f, 1.836f, 16.25f, 2.25f, 16.25f)
            horizontalLineTo(4.055f)
            curveTo(4.159f, 16.912f, 4.412f, 17.555f, 4.816f, 18.124f)
            lineTo(3.22f, 19.72f)
            curveTo(2.927f, 20.013f, 2.927f, 20.487f, 3.22f, 20.78f)
            curveTo(3.513f, 21.073f, 3.987f, 21.073f, 4.28f, 20.78f)
            lineTo(5.876f, 19.185f)
            curveTo(6.445f, 19.589f, 7.088f, 19.843f, 7.75f, 19.947f)
            verticalLineTo(21.75f)
            curveTo(7.75f, 22.164f, 8.086f, 22.5f, 8.5f, 22.5f)
            curveTo(8.914f, 22.5f, 9.25f, 22.164f, 9.25f, 21.75f)
            verticalLineTo(19.927f)
            curveTo(10.105f, 19.77f, 10.922f, 19.361f, 11.583f, 18.7f)
            lineTo(12.361f, 17.922f)
            lineTo(13.72f, 19.28f)
            curveTo(14.013f, 19.573f, 14.487f, 19.573f, 14.78f, 19.28f)
            curveTo(15.073f, 18.987f, 15.073f, 18.513f, 14.78f, 18.22f)
            lineTo(13.422f, 16.861f)
            lineTo(16.861f, 13.422f)
            lineTo(18.22f, 14.78f)
            curveTo(18.513f, 15.073f, 18.987f, 15.073f, 19.28f, 14.78f)
            curveTo(19.573f, 14.487f, 19.573f, 14.013f, 19.28f, 13.72f)
            lineTo(17.922f, 12.361f)
            lineTo(18.702f, 11.581f)
            curveTo(19.363f, 10.921f, 19.772f, 10.104f, 19.929f, 9.25f)
            horizontalLineTo(21.75f)
            curveTo(22.164f, 9.25f, 22.5f, 8.914f, 22.5f, 8.5f)
            curveTo(22.5f, 8.086f, 22.164f, 7.75f, 21.75f, 7.75f)
            horizontalLineTo(19.949f)
            curveTo(19.846f, 7.087f, 19.591f, 6.444f, 19.187f, 5.874f)
            lineTo(20.78f, 4.28f)
            curveTo(21.073f, 3.987f, 21.073f, 3.513f, 20.78f, 3.22f)
            curveTo(20.487f, 2.927f, 20.013f, 2.927f, 19.72f, 3.22f)
            lineTo(18.126f, 4.814f)
            curveTo(17.556f, 4.41f, 16.913f, 4.156f, 16.25f, 4.053f)
            verticalLineTo(2.25f)
            close()
            moveTo(8.498f, 16.5f)
            curveTo(7.946f, 16.5f, 7.498f, 16.053f, 7.498f, 15.5f)
            curveTo(7.498f, 14.948f, 7.946f, 14.5f, 8.498f, 14.5f)
            curveTo(9.051f, 14.5f, 9.498f, 14.948f, 9.498f, 15.5f)
            curveTo(9.498f, 16.053f, 9.051f, 16.5f, 8.498f, 16.5f)
            close()
            moveTo(16.498f, 8.5f)
            curveTo(16.498f, 9.053f, 16.051f, 9.5f, 15.498f, 9.5f)
            curveTo(14.946f, 9.5f, 14.498f, 9.053f, 14.498f, 8.5f)
            curveTo(14.498f, 7.948f, 14.946f, 7.5f, 15.498f, 7.5f)
            curveTo(16.051f, 7.5f, 16.498f, 7.948f, 16.498f, 8.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MoldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Mold, contentDescription = null)
    }
}
