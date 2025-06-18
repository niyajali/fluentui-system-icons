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

public val FluentIcons.Regular.PeopleLink: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PeopleLink",
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
            curveTo(9.376f, 21f, 10.453f, 20.757f, 11.289f, 20.373f)
            curveTo(11.014f, 19.959f, 10.803f, 19.499f, 10.668f, 19.008f)
            curveTo(10.042f, 19.297f, 9.183f, 19.5f, 8f, 19.5f)
            curveTo(5.578f, 19.5f, 4.514f, 18.65f, 4.021f, 17.945f)
            curveTo(3.76f, 17.572f, 3.628f, 17.197f, 3.562f, 16.916f)
            curveTo(3.53f, 16.775f, 3.514f, 16.661f, 3.507f, 16.587f)
            curveTo(3.503f, 16.549f, 3.501f, 16.522f, 3.5f, 16.507f)
            lineTo(3.5f, 16.495f)
            verticalLineTo(16.25f)
            curveTo(3.5f, 15.836f, 3.836f, 15.5f, 4.25f, 15.5f)
            horizontalLineTo(11.066f)
            curveTo(11.366f, 14.943f, 11.773f, 14.453f, 12.261f, 14.058f)
            curveTo(12.097f, 14.02f, 11.926f, 14f, 11.75f, 14f)
            horizontalLineTo(4.25f)
            close()
            moveTo(22.5f, 17.75f)
            curveTo(22.5f, 15.679f, 20.821f, 14f, 18.75f, 14f)
            lineTo(18.648f, 14.007f)
            curveTo(18.282f, 14.057f, 18f, 14.37f, 18f, 14.75f)
            curveTo(18f, 15.164f, 18.336f, 15.5f, 18.75f, 15.5f)
            lineTo(18.904f, 15.505f)
            curveTo(20.075f, 15.584f, 21f, 16.559f, 21f, 17.75f)
            curveTo(21f, 18.993f, 19.993f, 20f, 18.75f, 20f)
            lineTo(18.747f, 20.005f)
            lineTo(18.645f, 20.012f)
            curveTo(18.279f, 20.063f, 17.998f, 20.378f, 18f, 20.758f)
            curveTo(18.002f, 21.172f, 18.339f, 21.507f, 18.753f, 21.505f)
            verticalLineTo(21.5f)
            lineTo(18.952f, 21.495f)
            curveTo(20.928f, 21.391f, 22.5f, 19.754f, 22.5f, 17.75f)
            close()
            moveTo(16f, 14.75f)
            curveTo(16f, 14.336f, 15.664f, 14f, 15.25f, 14f)
            lineTo(15.051f, 14.005f)
            curveTo(13.072f, 14.109f, 11.5f, 15.746f, 11.5f, 17.75f)
            curveTo(11.5f, 19.821f, 13.179f, 21.5f, 15.25f, 21.5f)
            lineTo(15.352f, 21.493f)
            curveTo(15.718f, 21.444f, 16f, 21.13f, 16f, 20.75f)
            curveTo(16f, 20.336f, 15.664f, 20f, 15.25f, 20f)
            lineTo(15.096f, 19.995f)
            curveTo(13.925f, 19.916f, 13f, 18.941f, 13f, 17.75f)
            curveTo(13f, 16.507f, 14.007f, 15.5f, 15.25f, 15.5f)
            lineTo(15.352f, 15.493f)
            curveTo(15.718f, 15.443f, 16f, 15.13f, 16f, 14.75f)
            close()
            moveTo(19.5f, 17.75f)
            curveTo(19.5f, 17.336f, 19.164f, 17f, 18.75f, 17f)
            horizontalLineTo(15.25f)
            lineTo(15.148f, 17.007f)
            curveTo(14.782f, 17.056f, 14.5f, 17.37f, 14.5f, 17.75f)
            curveTo(14.5f, 18.164f, 14.836f, 18.5f, 15.25f, 18.5f)
            horizontalLineTo(18.75f)
            lineTo(18.852f, 18.493f)
            curveTo(19.218f, 18.444f, 19.5f, 18.13f, 19.5f, 17.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleLinkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PeopleLink, contentDescription = null)
    }
}
