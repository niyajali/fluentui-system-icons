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

public val FluentIcons.Filled.EditPerson: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.EditPerson",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
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
            lineTo(14.253f, 14.809f)
            curveTo(14.09f, 14.404f, 14f, 13.963f, 14f, 13.5f)
            curveTo(14f, 11.567f, 15.567f, 10f, 17.5f, 10f)
            curveTo(17.962f, 10f, 18.404f, 10.09f, 18.808f, 10.253f)
            lineTo(19f, 10.061f)
            lineTo(13.939f, 5.001f)
            close()
            moveTo(20f, 13.5f)
            curveTo(20f, 14.881f, 18.881f, 16f, 17.5f, 16f)
            curveTo(16.119f, 16f, 15f, 14.881f, 15f, 13.5f)
            curveTo(15f, 12.119f, 16.119f, 11f, 17.5f, 11f)
            curveTo(18.881f, 11f, 20f, 12.119f, 20f, 13.5f)
            close()
            moveTo(22f, 18.875f)
            curveTo(22f, 20.431f, 20.714f, 22f, 17.5f, 22f)
            curveTo(14.286f, 22f, 13f, 20.437f, 13f, 18.875f)
            verticalLineTo(18.772f)
            curveTo(13f, 17.793f, 13.794f, 17f, 14.773f, 17f)
            horizontalLineTo(20.227f)
            curveTo(21.206f, 17f, 22f, 17.793f, 22f, 18.772f)
            verticalLineTo(18.875f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun EditPersonPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.EditPerson, contentDescription = null)
    }
}
