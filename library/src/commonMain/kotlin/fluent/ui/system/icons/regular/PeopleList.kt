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

public val FluentUi.Regular.PeopleList: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PeopleList",
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
            curveTo(9.819f, 21f, 11.113f, 20.576f, 12.024f, 19.963f)
            curveTo(12.085f, 19.588f, 12.266f, 19.254f, 12.525f, 19f)
            curveTo(12.236f, 18.716f, 12.044f, 18.333f, 12.007f, 17.905f)
            curveTo(11.998f, 17.918f, 11.989f, 17.932f, 11.979f, 17.945f)
            curveTo(11.486f, 18.65f, 10.422f, 19.5f, 8f, 19.5f)
            curveTo(5.578f, 19.5f, 4.514f, 18.65f, 4.021f, 17.945f)
            curveTo(3.76f, 17.572f, 3.628f, 17.197f, 3.562f, 16.916f)
            curveTo(3.53f, 16.775f, 3.514f, 16.661f, 3.507f, 16.587f)
            curveTo(3.503f, 16.549f, 3.501f, 16.522f, 3.5f, 16.507f)
            lineTo(3.5f, 16.495f)
            verticalLineTo(16.25f)
            curveTo(3.5f, 15.836f, 3.836f, 15.5f, 4.25f, 15.5f)
            horizontalLineTo(11.75f)
            curveTo(11.847f, 15.5f, 11.941f, 15.519f, 12.026f, 15.552f)
            curveTo(12.009f, 15.454f, 12f, 15.353f, 12f, 15.25f)
            curveTo(12f, 14.812f, 12.161f, 14.411f, 12.428f, 14.104f)
            curveTo(12.214f, 14.036f, 11.986f, 14f, 11.75f, 14f)
            horizontalLineTo(4.25f)
            close()
            moveTo(12.525f, 16.5f)
            curveTo(12.516f, 16.509f, 12.507f, 16.518f, 12.498f, 16.527f)
            lineTo(12.5f, 16.507f)
            lineTo(12.5f, 16.495f)
            verticalLineTo(16.475f)
            curveTo(12.508f, 16.483f, 12.517f, 16.492f, 12.525f, 16.5f)
            close()
            moveTo(13.75f, 14.5f)
            curveTo(13.336f, 14.5f, 13f, 14.836f, 13f, 15.25f)
            curveTo(13f, 15.664f, 13.336f, 16f, 13.75f, 16f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 16f, 22f, 15.664f, 22f, 15.25f)
            curveTo(22f, 14.836f, 21.664f, 14.5f, 21.25f, 14.5f)
            horizontalLineTo(13.75f)
            close()
            moveTo(13.75f, 17f)
            curveTo(13.336f, 17f, 13f, 17.336f, 13f, 17.75f)
            curveTo(13f, 18.164f, 13.336f, 18.5f, 13.75f, 18.5f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 18.5f, 22f, 18.164f, 22f, 17.75f)
            curveTo(22f, 17.336f, 21.664f, 17f, 21.25f, 17f)
            horizontalLineTo(13.75f)
            close()
            moveTo(13.75f, 19.5f)
            curveTo(13.336f, 19.5f, 13f, 19.836f, 13f, 20.25f)
            curveTo(13f, 20.664f, 13.336f, 21f, 13.75f, 21f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 21f, 22f, 20.664f, 22f, 20.25f)
            curveTo(22f, 19.836f, 21.664f, 19.5f, 21.25f, 19.5f)
            horizontalLineTo(13.75f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PeopleList, contentDescription = null)
    }
}
