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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ShareAndroid: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShareAndroid",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17f, 2.498f)
            curveTo(18.934f, 2.498f, 20.502f, 4.066f, 20.502f, 6f)
            curveTo(20.502f, 7.934f, 18.934f, 9.502f, 17f, 9.502f)
            curveTo(15.97f, 9.502f, 15.044f, 9.057f, 14.403f, 8.349f)
            lineTo(9.845f, 10.953f)
            curveTo(9.948f, 11.284f, 10.003f, 11.635f, 10.003f, 12f)
            curveTo(10.003f, 12.364f, 9.948f, 12.716f, 9.845f, 13.046f)
            lineTo(14.402f, 15.652f)
            curveTo(15.043f, 14.943f, 15.969f, 14.498f, 17f, 14.498f)
            curveTo(18.934f, 14.498f, 20.502f, 16.066f, 20.502f, 18f)
            curveTo(20.502f, 19.934f, 18.934f, 21.502f, 17f, 21.502f)
            curveTo(15.066f, 21.502f, 13.498f, 19.934f, 13.498f, 18f)
            curveTo(13.498f, 17.635f, 13.554f, 17.284f, 13.657f, 16.954f)
            lineTo(9.1f, 14.348f)
            curveTo(8.459f, 15.057f, 7.532f, 15.502f, 6.502f, 15.502f)
            curveTo(4.568f, 15.502f, 3f, 13.934f, 3f, 12f)
            curveTo(3f, 10.066f, 4.568f, 8.498f, 6.502f, 8.498f)
            curveTo(7.532f, 8.498f, 8.458f, 8.943f, 9.099f, 9.651f)
            lineTo(13.657f, 7.046f)
            curveTo(13.554f, 6.716f, 13.498f, 6.364f, 13.498f, 6f)
            curveTo(13.498f, 4.066f, 15.066f, 2.498f, 17f, 2.498f)
            close()
            moveTo(17f, 15.998f)
            curveTo(15.894f, 15.998f, 14.998f, 16.894f, 14.998f, 18f)
            curveTo(14.998f, 19.105f, 15.894f, 20.002f, 17f, 20.002f)
            curveTo(18.105f, 20.002f, 19.002f, 19.105f, 19.002f, 18f)
            curveTo(19.002f, 16.894f, 18.105f, 15.998f, 17f, 15.998f)
            close()
            moveTo(6.502f, 9.998f)
            curveTo(5.396f, 9.998f, 4.5f, 10.894f, 4.5f, 12f)
            curveTo(4.5f, 13.105f, 5.396f, 14.002f, 6.502f, 14.002f)
            curveTo(7.607f, 14.002f, 8.504f, 13.105f, 8.504f, 12f)
            curveTo(8.504f, 10.894f, 7.607f, 9.998f, 6.502f, 9.998f)
            close()
            moveTo(17f, 3.998f)
            curveTo(15.894f, 3.998f, 14.998f, 4.894f, 14.998f, 6f)
            curveTo(14.998f, 7.105f, 15.894f, 8.002f, 17f, 8.002f)
            curveTo(18.105f, 8.002f, 19.002f, 7.105f, 19.002f, 6f)
            curveTo(19.002f, 4.894f, 18.105f, 3.998f, 17f, 3.998f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShareAndroidPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ShareAndroid, contentDescription = null)
    }
}
