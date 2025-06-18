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

public val FluentUi.Filled.Edit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Edit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15.891f, 3.048f)
            curveTo(17.288f, 1.651f, 19.554f, 1.651f, 20.952f, 3.048f)
            curveTo(22.349f, 4.445f, 22.349f, 6.711f, 20.952f, 8.109f)
            lineTo(20.06f, 9.001f)
            lineTo(15f, 3.94f)
            lineTo(15.891f, 3.048f)
            close()
            moveTo(13.939f, 5.001f)
            lineTo(3.941f, 15f)
            curveTo(3.535f, 15.406f, 3.249f, 15.917f, 3.116f, 16.476f)
            lineTo(2.02f, 21.078f)
            curveTo(1.96f, 21.331f, 2.036f, 21.598f, 2.22f, 21.782f)
            curveTo(2.404f, 21.966f, 2.67f, 22.041f, 2.924f, 21.981f)
            lineTo(7.525f, 20.885f)
            curveTo(8.084f, 20.752f, 8.595f, 20.467f, 9.002f, 20.06f)
            lineTo(19f, 10.061f)
            lineTo(13.939f, 5.001f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Edit, contentDescription = null)
    }
}
