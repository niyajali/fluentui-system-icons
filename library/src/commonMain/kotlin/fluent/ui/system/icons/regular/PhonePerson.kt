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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.PhonePerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PhonePerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(13.75f, 2f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineTo(11.337f)
            curveTo(15.376f, 11.633f, 14.854f, 12.108f, 14.5f, 12.696f)
            verticalLineTo(4.25f)
            curveTo(14.5f, 3.836f, 14.164f, 3.5f, 13.75f, 3.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 3.5f, 5.5f, 3.836f, 5.5f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(5.5f, 20.164f, 5.836f, 20.5f, 6.25f, 20.5f)
            horizontalLineTo(12.052f)
            curveTo(12.14f, 21.025f, 12.341f, 21.537f, 12.665f, 22f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 22f, 4f, 20.993f, 4f, 19.75f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            close()
            moveTo(11.249f, 17.5f)
            curveTo(11.663f, 17.499f, 11.999f, 17.835f, 12f, 18.249f)
            curveTo(12.001f, 18.663f, 11.665f, 18.999f, 11.251f, 19f)
            lineTo(8.751f, 19.004f)
            curveTo(8.337f, 19.004f, 8.001f, 18.669f, 8f, 18.255f)
            curveTo(7.999f, 17.841f, 8.335f, 17.504f, 8.749f, 17.504f)
            lineTo(11.249f, 17.5f)
            close()
            moveTo(20f, 14.5f)
            curveTo(20f, 15.881f, 18.881f, 17f, 17.5f, 17f)
            curveTo(16.119f, 17f, 15f, 15.881f, 15f, 14.5f)
            curveTo(15f, 13.119f, 16.119f, 12f, 17.5f, 12f)
            curveTo(18.881f, 12f, 20f, 13.119f, 20f, 14.5f)
            close()
            moveTo(22f, 19.875f)
            curveTo(22f, 21.431f, 20.714f, 23f, 17.5f, 23f)
            curveTo(14.286f, 23f, 13f, 21.437f, 13f, 19.875f)
            verticalLineTo(19.772f)
            curveTo(13f, 18.793f, 13.794f, 18f, 14.773f, 18f)
            horizontalLineTo(20.227f)
            curveTo(21.206f, 18f, 22f, 18.793f, 22f, 19.772f)
            verticalLineTo(19.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PhonePersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PhonePerson, contentDescription = null)
    }
}
