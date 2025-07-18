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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.EyeTracking: ImageVector
    get() {
        if (_EyeTracking != null) {
            return _EyeTracking!!
        }
        _EyeTracking = ImageVector.Builder(
            name = "Filled.EyeTracking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.49f, 15.648f)
                curveTo(3.441f, 15.282f, 3.127f, 15f, 2.747f, 15f)
                curveTo(2.367f, 15f, 2.054f, 15.282f, 2.004f, 15.648f)
                lineTo(1.997f, 15.75f)
                verticalLineTo(19.252f)
                lineTo(2.003f, 19.427f)
                curveTo(2.089f, 20.809f, 3.196f, 21.914f, 4.58f, 21.997f)
                lineTo(4.747f, 22.002f)
                horizontalLineTo(8.247f)
                lineTo(8.349f, 21.996f)
                curveTo(8.715f, 21.946f, 8.997f, 21.632f, 8.997f, 21.252f)
                curveTo(8.997f, 20.873f, 8.715f, 20.559f, 8.349f, 20.509f)
                lineTo(8.247f, 20.502f)
                horizontalLineTo(4.747f)
                lineTo(4.619f, 20.496f)
                curveTo(4.031f, 20.436f, 3.563f, 19.968f, 3.504f, 19.38f)
                lineTo(3.497f, 19.252f)
                verticalLineTo(15.75f)
                lineTo(3.49f, 15.648f)
                close()
                moveTo(21.99f, 15.648f)
                curveTo(21.941f, 15.282f, 21.627f, 15f, 21.247f, 15f)
                curveTo(20.833f, 15f, 20.497f, 15.336f, 20.497f, 15.75f)
                verticalLineTo(19.252f)
                lineTo(20.491f, 19.38f)
                curveTo(20.427f, 20.01f, 19.894f, 20.502f, 19.247f, 20.502f)
                horizontalLineTo(15.747f)
                lineTo(15.645f, 20.509f)
                curveTo(15.279f, 20.559f, 14.997f, 20.873f, 14.997f, 21.252f)
                curveTo(14.997f, 21.667f, 15.333f, 22.002f, 15.747f, 22.002f)
                horizontalLineTo(19.247f)
                lineTo(19.415f, 21.997f)
                curveTo(20.855f, 21.911f, 21.997f, 20.715f, 21.997f, 19.252f)
                verticalLineTo(15.75f)
                lineTo(21.99f, 15.648f)
                close()
                moveTo(8.997f, 2.75f)
                curveTo(8.997f, 2.336f, 8.661f, 2f, 8.247f, 2f)
                horizontalLineTo(4.747f)
                lineTo(4.58f, 2.005f)
                curveTo(3.139f, 2.092f, 1.997f, 3.287f, 1.997f, 4.75f)
                verticalLineTo(8.252f)
                lineTo(2.004f, 8.354f)
                curveTo(2.054f, 8.72f, 2.367f, 9.002f, 2.747f, 9.002f)
                curveTo(3.161f, 9.002f, 3.497f, 8.667f, 3.497f, 8.252f)
                verticalLineTo(4.75f)
                lineTo(3.504f, 4.622f)
                curveTo(3.568f, 3.992f, 4.1f, 3.5f, 4.747f, 3.5f)
                horizontalLineTo(8.247f)
                lineTo(8.349f, 3.493f)
                curveTo(8.715f, 3.443f, 8.997f, 3.13f, 8.997f, 2.75f)
                close()
                moveTo(19.415f, 2.005f)
                lineTo(19.247f, 2f)
                horizontalLineTo(15.747f)
                lineTo(15.645f, 2.007f)
                curveTo(15.279f, 2.057f, 14.997f, 2.37f, 14.997f, 2.75f)
                curveTo(14.997f, 3.13f, 15.279f, 3.443f, 15.645f, 3.493f)
                lineTo(15.747f, 3.5f)
                horizontalLineTo(19.247f)
                lineTo(19.375f, 3.506f)
                curveTo(19.963f, 3.566f, 20.431f, 4.034f, 20.491f, 4.622f)
                lineTo(20.497f, 4.75f)
                verticalLineTo(8.252f)
                lineTo(20.504f, 8.354f)
                curveTo(20.554f, 8.72f, 20.867f, 9.002f, 21.247f, 9.002f)
                curveTo(21.627f, 9.002f, 21.941f, 8.72f, 21.99f, 8.354f)
                lineTo(21.997f, 8.252f)
                verticalLineTo(4.75f)
                lineTo(21.992f, 4.576f)
                curveTo(21.905f, 3.194f, 20.798f, 2.088f, 19.415f, 2.005f)
                close()
                moveTo(8.5f, 13.5f)
                curveTo(8.5f, 11.567f, 10.067f, 10f, 12f, 10f)
                curveTo(13.933f, 10f, 15.5f, 11.567f, 15.5f, 13.5f)
                curveTo(15.5f, 15.433f, 13.933f, 17f, 12f, 17f)
                curveTo(10.067f, 17f, 8.5f, 15.433f, 8.5f, 13.5f)
                close()
                moveTo(6.21f, 11.743f)
                lineTo(6.202f, 11.764f)
                lineTo(6.201f, 11.766f)
                curveTo(6.055f, 12.152f, 5.624f, 12.347f, 5.237f, 12.202f)
                curveTo(4.639f, 11.978f, 4.799f, 11.233f, 4.801f, 11.228f)
                lineTo(4.807f, 11.213f)
                curveTo(4.812f, 11.201f, 4.818f, 11.186f, 4.826f, 11.167f)
                curveTo(4.842f, 11.129f, 4.864f, 11.076f, 4.894f, 11.012f)
                curveTo(4.954f, 10.884f, 5.042f, 10.707f, 5.165f, 10.497f)
                curveTo(5.409f, 10.079f, 5.79f, 9.524f, 6.345f, 8.97f)
                curveTo(7.465f, 7.849f, 9.274f, 6.75f, 12f, 6.75f)
                curveTo(14.726f, 6.75f, 16.535f, 7.849f, 17.655f, 8.97f)
                curveTo(18.21f, 9.524f, 18.591f, 10.079f, 18.835f, 10.497f)
                curveTo(18.958f, 10.707f, 19.046f, 10.884f, 19.106f, 11.012f)
                curveTo(19.136f, 11.076f, 19.158f, 11.129f, 19.174f, 11.167f)
                curveTo(19.182f, 11.186f, 19.188f, 11.201f, 19.193f, 11.213f)
                lineTo(19.199f, 11.228f)
                lineTo(19.201f, 11.233f)
                lineTo(19.202f, 11.235f)
                lineTo(19.202f, 11.237f)
                curveTo(19.348f, 11.625f, 19.151f, 12.057f, 18.763f, 12.202f)
                curveTo(18.377f, 12.347f, 17.947f, 12.144f, 17.798f, 11.764f)
                lineTo(17.79f, 11.743f)
                curveTo(17.79f, 11.743f, 17.767f, 11.689f, 17.746f, 11.644f)
                curveTo(17.704f, 11.554f, 17.636f, 11.418f, 17.54f, 11.253f)
                curveTo(17.346f, 10.921f, 17.04f, 10.476f, 16.595f, 10.03f)
                curveTo(15.715f, 9.151f, 14.274f, 8.25f, 12f, 8.25f)
                curveTo(9.726f, 8.25f, 8.285f, 9.151f, 7.405f, 10.03f)
                curveTo(6.96f, 10.476f, 6.654f, 10.921f, 6.46f, 11.253f)
                curveTo(6.364f, 11.418f, 6.297f, 11.554f, 6.254f, 11.644f)
                curveTo(6.234f, 11.689f, 6.219f, 11.723f, 6.21f, 11.743f)
                close()
            }
        }.build()

        return _EyeTracking!!
    }

@Suppress("ObjectPropertyName")
private var _EyeTracking: ImageVector? = null

@Preview
@Composable
private fun EyeTrackingPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.EyeTracking, contentDescription = null)
    }
}
