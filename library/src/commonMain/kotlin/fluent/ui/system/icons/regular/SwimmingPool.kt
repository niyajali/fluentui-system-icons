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

public val FluentIcons.Regular.SwimmingPool: ImageVector
    get() {
        if (_SwimmingPool != null) {
            return _SwimmingPool!!
        }
        _SwimmingPool = ImageVector.Builder(
            name = "Regular.SwimmingPool",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.5f, 5.75f)
                curveTo(5.5f, 5.06f, 6.06f, 4.5f, 6.75f, 4.5f)
                curveTo(7.44f, 4.5f, 8f, 5.06f, 8f, 5.75f)
                verticalLineTo(12.036f)
                curveTo(8.477f, 12.081f, 8.978f, 12.169f, 9.5f, 12.31f)
                verticalLineTo(11f)
                horizontalLineTo(16f)
                verticalLineTo(14.499f)
                curveTo(16.479f, 14.492f, 16.915f, 14.432f, 17.299f, 14.347f)
                curveTo(17.368f, 14.332f, 17.434f, 14.316f, 17.5f, 14.299f)
                verticalLineTo(5.75f)
                curveTo(17.5f, 4.231f, 16.269f, 3f, 14.75f, 3f)
                curveTo(13.231f, 3f, 12f, 4.231f, 12f, 5.75f)
                verticalLineTo(6.25f)
                curveTo(12f, 6.664f, 12.336f, 7f, 12.75f, 7f)
                curveTo(13.164f, 7f, 13.5f, 6.664f, 13.5f, 6.25f)
                verticalLineTo(5.75f)
                curveTo(13.5f, 5.06f, 14.06f, 4.5f, 14.75f, 4.5f)
                curveTo(15.44f, 4.5f, 16f, 5.06f, 16f, 5.75f)
                verticalLineTo(9.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(5.75f)
                curveTo(9.5f, 4.231f, 8.269f, 3f, 6.75f, 3f)
                curveTo(5.231f, 3f, 4f, 4.231f, 4f, 5.75f)
                verticalLineTo(6.25f)
                curveTo(4f, 6.664f, 4.336f, 7f, 4.75f, 7f)
                curveTo(5.164f, 7f, 5.5f, 6.664f, 5.5f, 6.25f)
                verticalLineTo(5.75f)
                close()
                moveTo(4.281f, 15.526f)
                curveTo(3.99f, 15.818f, 3.518f, 15.82f, 3.224f, 15.531f)
                curveTo(2.929f, 15.24f, 2.925f, 14.766f, 3.215f, 14.47f)
                lineTo(3.216f, 14.469f)
                lineTo(3.217f, 14.469f)
                lineTo(3.219f, 14.467f)
                lineTo(3.223f, 14.462f)
                lineTo(3.235f, 14.451f)
                curveTo(3.245f, 14.441f, 3.257f, 14.43f, 3.272f, 14.416f)
                curveTo(3.302f, 14.388f, 3.343f, 14.351f, 3.396f, 14.307f)
                curveTo(3.501f, 14.219f, 3.651f, 14.103f, 3.845f, 13.976f)
                curveTo(4.232f, 13.722f, 4.8f, 13.422f, 5.537f, 13.223f)
                curveTo(7.033f, 12.817f, 9.14f, 12.847f, 11.737f, 14.33f)
                curveTo(14.043f, 15.648f, 16.07f, 15.642f, 17.514f, 15.323f)
                curveTo(18.242f, 15.163f, 18.828f, 14.922f, 19.228f, 14.723f)
                curveTo(19.428f, 14.623f, 19.58f, 14.535f, 19.679f, 14.474f)
                curveTo(19.728f, 14.443f, 19.764f, 14.42f, 19.787f, 14.405f)
                curveTo(19.798f, 14.398f, 19.805f, 14.392f, 19.809f, 14.39f)
                lineTo(19.81f, 14.389f)
                lineTo(19.812f, 14.388f)
                curveTo(20.147f, 14.146f, 20.615f, 14.222f, 20.857f, 14.556f)
                curveTo(21.1f, 14.892f, 21.026f, 15.361f, 20.69f, 15.604f)
                lineTo(20.689f, 15.605f)
                lineTo(20.687f, 15.606f)
                lineTo(20.682f, 15.609f)
                lineTo(20.668f, 15.619f)
                curveTo(20.657f, 15.627f, 20.642f, 15.637f, 20.623f, 15.65f)
                curveTo(20.586f, 15.675f, 20.533f, 15.71f, 20.466f, 15.751f)
                curveTo(20.332f, 15.833f, 20.14f, 15.944f, 19.896f, 16.066f)
                curveTo(19.409f, 16.308f, 18.707f, 16.597f, 17.837f, 16.788f)
                curveTo(16.084f, 17.174f, 13.668f, 17.161f, 10.993f, 15.633f)
                curveTo(8.724f, 14.337f, 7.024f, 14.374f, 5.929f, 14.67f)
                curveTo(5.37f, 14.822f, 4.946f, 15.047f, 4.666f, 15.231f)
                curveTo(4.527f, 15.322f, 4.424f, 15.402f, 4.359f, 15.456f)
                curveTo(4.327f, 15.483f, 4.305f, 15.504f, 4.292f, 15.515f)
                lineTo(4.281f, 15.526f)
                close()
                moveTo(3.224f, 19.531f)
                curveTo(3.518f, 19.82f, 3.99f, 19.818f, 4.281f, 19.526f)
                lineTo(4.292f, 19.515f)
                curveTo(4.305f, 19.504f, 4.327f, 19.483f, 4.359f, 19.456f)
                curveTo(4.424f, 19.402f, 4.527f, 19.322f, 4.666f, 19.23f)
                curveTo(4.946f, 19.047f, 5.37f, 18.822f, 5.929f, 18.67f)
                curveTo(7.024f, 18.374f, 8.724f, 18.337f, 10.993f, 19.633f)
                curveTo(13.668f, 21.161f, 16.084f, 21.174f, 17.837f, 20.788f)
                curveTo(18.707f, 20.597f, 19.409f, 20.308f, 19.896f, 20.066f)
                curveTo(20.14f, 19.944f, 20.332f, 19.833f, 20.466f, 19.751f)
                curveTo(20.533f, 19.709f, 20.586f, 19.675f, 20.623f, 19.65f)
                curveTo(20.642f, 19.637f, 20.657f, 19.627f, 20.668f, 19.619f)
                lineTo(20.682f, 19.609f)
                lineTo(20.687f, 19.606f)
                lineTo(20.689f, 19.605f)
                curveTo(20.691f, 19.603f, 20.69f, 19.604f, 20.69f, 19.604f)
                curveTo(21.026f, 19.361f, 21.1f, 18.892f, 20.857f, 18.556f)
                curveTo(20.615f, 18.222f, 20.147f, 18.146f, 19.812f, 18.388f)
                lineTo(19.81f, 18.389f)
                lineTo(19.809f, 18.39f)
                curveTo(19.805f, 18.392f, 19.798f, 18.398f, 19.787f, 18.405f)
                curveTo(19.764f, 18.42f, 19.728f, 18.444f, 19.679f, 18.474f)
                curveTo(19.58f, 18.535f, 19.428f, 18.623f, 19.228f, 18.723f)
                curveTo(18.828f, 18.922f, 18.242f, 19.163f, 17.514f, 19.323f)
                curveTo(16.07f, 19.642f, 14.043f, 19.648f, 11.737f, 18.33f)
                curveTo(9.14f, 16.847f, 7.033f, 16.817f, 5.537f, 17.223f)
                curveTo(4.8f, 17.422f, 4.232f, 17.722f, 3.845f, 17.976f)
                curveTo(3.651f, 18.103f, 3.501f, 18.219f, 3.396f, 18.307f)
                curveTo(3.343f, 18.351f, 3.302f, 18.388f, 3.272f, 18.416f)
                curveTo(3.257f, 18.43f, 3.245f, 18.441f, 3.235f, 18.451f)
                lineTo(3.223f, 18.462f)
                lineTo(3.219f, 18.467f)
                lineTo(3.217f, 18.469f)
                lineTo(3.216f, 18.469f)
                lineTo(3.215f, 18.47f)
                curveTo(2.925f, 18.766f, 2.929f, 19.24f, 3.224f, 19.531f)
                close()
            }
        }.build()

        return _SwimmingPool!!
    }

@Suppress("ObjectPropertyName")
private var _SwimmingPool: ImageVector? = null

@Preview
@Composable
private fun SwimmingPoolPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.SwimmingPool, contentDescription = null)
    }
}
