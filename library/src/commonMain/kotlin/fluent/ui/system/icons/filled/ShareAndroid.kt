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

public val FluentUi.Filled.ShareAndroid: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShareAndroid",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(17f, 3.002f)
            curveTo(18.656f, 3.002f, 19.998f, 4.344f, 19.998f, 6f)
            curveTo(19.998f, 7.656f, 18.656f, 8.998f, 17f, 8.998f)
            curveTo(16.158f, 8.998f, 15.397f, 8.651f, 14.852f, 8.092f)
            lineTo(9.395f, 11.211f)
            curveTo(9.464f, 11.463f, 9.5f, 11.727f, 9.5f, 12f)
            curveTo(9.5f, 12.273f, 9.464f, 12.537f, 9.395f, 12.789f)
            lineTo(14.853f, 15.908f)
            curveTo(15.398f, 15.349f, 16.158f, 15.002f, 17f, 15.002f)
            curveTo(18.656f, 15.002f, 19.998f, 16.344f, 19.998f, 18f)
            curveTo(19.998f, 19.656f, 18.656f, 20.998f, 17f, 20.998f)
            curveTo(15.344f, 20.998f, 14.002f, 19.656f, 14.002f, 18f)
            curveTo(14.002f, 17.727f, 14.039f, 17.463f, 14.107f, 17.211f)
            lineTo(8.65f, 14.092f)
            curveTo(8.105f, 14.651f, 7.344f, 14.998f, 6.502f, 14.998f)
            curveTo(4.846f, 14.998f, 3.504f, 13.656f, 3.504f, 12f)
            curveTo(3.504f, 10.344f, 4.846f, 9.002f, 6.502f, 9.002f)
            curveTo(7.344f, 9.002f, 8.105f, 9.349f, 8.649f, 9.908f)
            lineTo(14.107f, 6.789f)
            curveTo(14.039f, 6.537f, 14.002f, 6.273f, 14.002f, 6f)
            curveTo(14.002f, 4.344f, 15.344f, 3.002f, 17f, 3.002f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShareAndroidPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShareAndroid, contentDescription = null)
    }
}
