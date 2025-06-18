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

public val FluentUi.Filled.Pi: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Pi",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 7f)
            curveTo(2f, 5.343f, 3.343f, 4f, 5f, 4f)
            horizontalLineTo(20.25f)
            curveTo(20.802f, 4f, 21.25f, 4.448f, 21.25f, 5f)
            curveTo(21.25f, 5.552f, 20.802f, 6f, 20.25f, 6f)
            horizontalLineTo(17f)
            verticalLineTo(16.702f)
            curveTo(17f, 17.74f, 18.028f, 18.464f, 19.004f, 18.115f)
            lineTo(19.164f, 18.058f)
            curveTo(19.684f, 17.872f, 20.256f, 18.144f, 20.442f, 18.664f)
            curveTo(20.628f, 19.184f, 20.356f, 19.756f, 19.836f, 19.942f)
            lineTo(19.677f, 19.999f)
            curveTo(17.398f, 20.813f, 15f, 19.123f, 15f, 16.702f)
            verticalLineTo(6f)
            horizontalLineTo(9.979f)
            curveTo(9.968f, 6.221f, 9.951f, 6.514f, 9.927f, 6.868f)
            curveTo(9.872f, 7.697f, 9.777f, 8.863f, 9.618f, 10.211f)
            curveTo(9.303f, 12.894f, 8.73f, 16.352f, 7.695f, 19.329f)
            curveTo(7.513f, 19.85f, 6.943f, 20.126f, 6.422f, 19.944f)
            curveTo(5.9f, 19.763f, 5.624f, 19.193f, 5.806f, 18.671f)
            curveTo(6.77f, 15.898f, 7.323f, 12.606f, 7.632f, 9.977f)
            curveTo(7.786f, 8.669f, 7.878f, 7.537f, 7.932f, 6.734f)
            curveTo(7.951f, 6.444f, 7.966f, 6.197f, 7.976f, 6f)
            horizontalLineTo(5f)
            curveTo(4.448f, 6f, 4f, 6.448f, 4f, 7f)
            verticalLineTo(7.5f)
            curveTo(4f, 8.052f, 3.552f, 8.5f, 3f, 8.5f)
            curveTo(2.448f, 8.5f, 2f, 8.052f, 2f, 7.5f)
            verticalLineTo(7f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PiPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Pi, contentDescription = null)
    }
}
