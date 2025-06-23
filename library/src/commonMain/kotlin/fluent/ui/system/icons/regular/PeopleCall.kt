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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.PeopleCall: ImageVector
    get() {
        if (_PeopleCall != null) {
            return _PeopleCall!!
        }
        _PeopleCall = ImageVector.Builder(
            name = "Regular.PeopleCall",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.5f, 7f)
                curveTo(5.5f, 5.619f, 6.619f, 4.5f, 8f, 4.5f)
                curveTo(9.381f, 4.5f, 10.5f, 5.619f, 10.5f, 7f)
                curveTo(10.5f, 8.381f, 9.381f, 9.5f, 8f, 9.5f)
                curveTo(6.619f, 9.5f, 5.5f, 8.381f, 5.5f, 7f)
                close()
                moveTo(8f, 3f)
                curveTo(5.791f, 3f, 4f, 4.791f, 4f, 7f)
                curveTo(4f, 9.209f, 5.791f, 11f, 8f, 11f)
                curveTo(10.209f, 11f, 12f, 9.209f, 12f, 7f)
                curveTo(12f, 4.791f, 10.209f, 3f, 8f, 3f)
                close()
                moveTo(15.5f, 8f)
                curveTo(15.5f, 7.172f, 16.172f, 6.5f, 17f, 6.5f)
                curveTo(17.828f, 6.5f, 18.5f, 7.172f, 18.5f, 8f)
                curveTo(18.5f, 8.828f, 17.828f, 9.5f, 17f, 9.5f)
                curveTo(16.172f, 9.5f, 15.5f, 8.828f, 15.5f, 8f)
                close()
                moveTo(17f, 5f)
                curveTo(15.343f, 5f, 14f, 6.343f, 14f, 8f)
                curveTo(14f, 9.657f, 15.343f, 11f, 17f, 11f)
                curveTo(18.657f, 11f, 20f, 9.657f, 20f, 8f)
                curveTo(20f, 6.343f, 18.657f, 5f, 17f, 5f)
                close()
                moveTo(4.25f, 13f)
                curveTo(3.007f, 13f, 2f, 14.007f, 2f, 15.25f)
                verticalLineTo(15.501f)
                lineTo(2f, 15.502f)
                lineTo(2f, 15.505f)
                lineTo(2f, 15.511f)
                lineTo(2f, 15.528f)
                curveTo(2.001f, 15.541f, 2.001f, 15.557f, 2.002f, 15.577f)
                curveTo(2.004f, 15.617f, 2.007f, 15.67f, 2.014f, 15.736f)
                curveTo(2.027f, 15.866f, 2.052f, 16.045f, 2.102f, 16.256f)
                curveTo(2.2f, 16.678f, 2.397f, 17.24f, 2.792f, 17.805f)
                curveTo(3.611f, 18.975f, 5.172f, 20f, 8f, 20f)
                curveTo(10.828f, 20f, 12.389f, 18.975f, 13.208f, 17.805f)
                curveTo(13.604f, 17.24f, 13.8f, 16.678f, 13.898f, 16.256f)
                curveTo(13.948f, 16.045f, 13.973f, 15.866f, 13.986f, 15.736f)
                curveTo(13.993f, 15.67f, 13.996f, 15.617f, 13.998f, 15.577f)
                curveTo(13.999f, 15.557f, 13.999f, 15.541f, 14f, 15.528f)
                lineTo(14f, 15.511f)
                lineTo(14f, 15.505f)
                lineTo(14f, 15.502f)
                lineTo(14f, 15.25f)
                curveTo(14f, 14.007f, 12.993f, 13f, 11.75f, 13f)
                horizontalLineTo(4.25f)
                close()
                moveTo(3.5f, 15.507f)
                lineTo(3.5f, 15.495f)
                verticalLineTo(15.25f)
                curveTo(3.5f, 14.836f, 3.836f, 14.5f, 4.25f, 14.5f)
                horizontalLineTo(11.75f)
                curveTo(12.164f, 14.5f, 12.5f, 14.836f, 12.5f, 15.25f)
                verticalLineTo(15.495f)
                lineTo(12.5f, 15.507f)
                curveTo(12.499f, 15.522f, 12.497f, 15.549f, 12.493f, 15.587f)
                curveTo(12.486f, 15.661f, 12.47f, 15.775f, 12.438f, 15.915f)
                curveTo(12.372f, 16.197f, 12.24f, 16.572f, 11.979f, 16.945f)
                curveTo(11.486f, 17.65f, 10.422f, 18.5f, 8f, 18.5f)
                curveTo(5.578f, 18.5f, 4.514f, 17.65f, 4.021f, 16.945f)
                curveTo(3.76f, 16.572f, 3.628f, 16.197f, 3.562f, 15.915f)
                curveTo(3.53f, 15.775f, 3.514f, 15.661f, 3.507f, 15.587f)
                curveTo(3.503f, 15.549f, 3.501f, 15.522f, 3.5f, 15.507f)
                close()
                moveTo(18.192f, 13.995f)
                lineTo(18.668f, 12.79f)
                curveTo(18.91f, 12.176f, 19.589f, 11.857f, 20.216f, 12.062f)
                lineTo(20.647f, 12.203f)
                curveTo(21.371f, 12.44f, 21.973f, 13.009f, 21.997f, 13.772f)
                curveTo(22.096f, 16.883f, 19.521f, 21.354f, 16.784f, 22.827f)
                curveTo(16.111f, 23.189f, 15.316f, 22.95f, 14.748f, 22.436f)
                lineTo(14.412f, 22.131f)
                curveTo(13.923f, 21.688f, 13.861f, 20.942f, 14.27f, 20.425f)
                lineTo(15.07f, 19.415f)
                curveTo(15.36f, 19.048f, 15.837f, 18.884f, 16.291f, 18.995f)
                lineTo(17.582f, 19.308f)
                curveTo(18.685f, 18.578f, 19.277f, 17.552f, 19.356f, 16.229f)
                lineTo(18.44f, 15.265f)
                curveTo(18.117f, 14.926f, 18.021f, 14.43f, 18.192f, 13.995f)
                close()
            }
        }.build()

        return _PeopleCall!!
    }

@Suppress("ObjectPropertyName")
private var _PeopleCall: ImageVector? = null

@Preview
@Composable
private fun PeopleCallPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PeopleCall, contentDescription = null)
    }
}
