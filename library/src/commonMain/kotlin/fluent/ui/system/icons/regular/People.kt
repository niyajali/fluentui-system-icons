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

public val FluentIcons.Regular.People: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.People",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.5f, 8f)
            curveTo(5.5f, 6.619f, 6.619f, 5.5f, 8f, 5.5f)
            curveTo(9.381f, 5.5f, 10.5f, 6.619f, 10.5f, 8f)
            curveTo(10.5f, 9.381f, 9.381f, 10.5f, 8f, 10.5f)
            curveTo(6.619f, 10.5f, 5.5f, 9.381f, 5.5f, 8f)
            close()
            moveTo(8f, 4f)
            curveTo(5.791f, 4f, 4f, 5.791f, 4f, 8f)
            curveTo(4f, 10.209f, 5.791f, 12f, 8f, 12f)
            curveTo(10.209f, 12f, 12f, 10.209f, 12f, 8f)
            curveTo(12f, 5.791f, 10.209f, 4f, 8f, 4f)
            close()
            moveTo(15.5f, 9f)
            curveTo(15.5f, 8.172f, 16.172f, 7.5f, 17f, 7.5f)
            curveTo(17.828f, 7.5f, 18.5f, 8.172f, 18.5f, 9f)
            curveTo(18.5f, 9.828f, 17.828f, 10.5f, 17f, 10.5f)
            curveTo(16.172f, 10.5f, 15.5f, 9.828f, 15.5f, 9f)
            close()
            moveTo(17f, 6f)
            curveTo(15.343f, 6f, 14f, 7.343f, 14f, 9f)
            curveTo(14f, 10.657f, 15.343f, 12f, 17f, 12f)
            curveTo(18.657f, 12f, 20f, 10.657f, 20f, 9f)
            curveTo(20f, 7.343f, 18.657f, 6f, 17f, 6f)
            close()
            moveTo(14.248f, 19.038f)
            curveTo(14.951f, 19.323f, 15.852f, 19.5f, 17.001f, 19.5f)
            curveTo(19.283f, 19.5f, 20.587f, 18.803f, 21.298f, 17.942f)
            curveTo(21.643f, 17.524f, 21.819f, 17.103f, 21.908f, 16.779f)
            curveTo(21.952f, 16.618f, 21.975f, 16.48f, 21.987f, 16.377f)
            curveTo(21.994f, 16.325f, 21.997f, 16.282f, 21.999f, 16.249f)
            curveTo(22f, 16.232f, 22f, 16.218f, 22.001f, 16.206f)
            lineTo(22.001f, 16.19f)
            lineTo(22.001f, 16.184f)
            lineTo(22.001f, 16.181f)
            lineTo(22.001f, 16.179f)
            curveTo(22.001f, 14.975f, 21.026f, 14f, 19.822f, 14f)
            horizontalLineTo(14.18f)
            curveTo(14.152f, 14f, 14.125f, 14f, 14.098f, 14.002f)
            curveTo(14.492f, 14.413f, 14.779f, 14.927f, 14.914f, 15.5f)
            horizontalLineTo(19.822f)
            curveTo(20.194f, 15.5f, 20.496f, 15.799f, 20.501f, 16.169f)
            curveTo(20.501f, 16.175f, 20.5f, 16.185f, 20.498f, 16.201f)
            curveTo(20.493f, 16.239f, 20.483f, 16.302f, 20.462f, 16.381f)
            curveTo(20.418f, 16.54f, 20.328f, 16.761f, 20.142f, 16.986f)
            curveTo(19.79f, 17.412f, 18.969f, 18f, 17.001f, 18f)
            curveTo(16.021f, 18f, 15.325f, 17.854f, 14.83f, 17.655f)
            curveTo(14.723f, 18.055f, 14.545f, 18.538f, 14.248f, 19.038f)
            close()
            moveTo(4.25f, 14f)
            curveTo(3.007f, 14f, 2f, 15.007f, 2f, 16.25f)
            verticalLineTo(16.501f)
            lineTo(2f, 16.502f)
            lineTo(2f, 16.505f)
            lineTo(2f, 16.511f)
            lineTo(2f, 16.528f)
            curveTo(2.001f, 16.541f, 2.001f, 16.557f, 2.002f, 16.577f)
            curveTo(2.004f, 16.617f, 2.007f, 16.67f, 2.014f, 16.736f)
            curveTo(2.027f, 16.866f, 2.052f, 17.045f, 2.102f, 17.256f)
            curveTo(2.2f, 17.678f, 2.397f, 18.24f, 2.792f, 18.805f)
            curveTo(3.611f, 19.975f, 5.172f, 21f, 8f, 21f)
            curveTo(10.828f, 21f, 12.389f, 19.975f, 13.208f, 18.805f)
            curveTo(13.604f, 18.24f, 13.8f, 17.678f, 13.898f, 17.256f)
            curveTo(13.948f, 17.045f, 13.973f, 16.866f, 13.986f, 16.736f)
            curveTo(13.993f, 16.67f, 13.996f, 16.617f, 13.998f, 16.577f)
            curveTo(13.999f, 16.557f, 13.999f, 16.541f, 14f, 16.528f)
            lineTo(14f, 16.511f)
            lineTo(14f, 16.505f)
            lineTo(14f, 16.502f)
            lineTo(14f, 16.25f)
            curveTo(14f, 15.007f, 12.993f, 14f, 11.75f, 14f)
            horizontalLineTo(4.25f)
            close()
            moveTo(3.5f, 16.507f)
            lineTo(3.5f, 16.495f)
            verticalLineTo(16.25f)
            curveTo(3.5f, 15.836f, 3.836f, 15.5f, 4.25f, 15.5f)
            horizontalLineTo(11.75f)
            curveTo(12.164f, 15.5f, 12.5f, 15.836f, 12.5f, 16.25f)
            verticalLineTo(16.495f)
            lineTo(12.5f, 16.507f)
            curveTo(12.499f, 16.522f, 12.497f, 16.549f, 12.493f, 16.587f)
            curveTo(12.486f, 16.661f, 12.47f, 16.775f, 12.438f, 16.916f)
            curveTo(12.372f, 17.197f, 12.24f, 17.572f, 11.979f, 17.945f)
            curveTo(11.486f, 18.65f, 10.422f, 19.5f, 8f, 19.5f)
            curveTo(5.578f, 19.5f, 4.514f, 18.65f, 4.021f, 17.945f)
            curveTo(3.76f, 17.572f, 3.628f, 17.197f, 3.562f, 16.916f)
            curveTo(3.53f, 16.775f, 3.514f, 16.661f, 3.507f, 16.587f)
            curveTo(3.503f, 16.549f, 3.501f, 16.522f, 3.5f, 16.507f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeoplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.People, contentDescription = null)
    }
}
