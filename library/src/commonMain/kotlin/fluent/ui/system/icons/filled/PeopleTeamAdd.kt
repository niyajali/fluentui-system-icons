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

public val FluentIcons.Filled.PeopleTeamAdd: ImageVector
    get() {
        if (_PeopleTeamAdd != null) {
            return _PeopleTeamAdd!!
        }
        _PeopleTeamAdd = ImageVector.Builder(
            name = "Filled.PeopleTeamAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(17.5f, 13.999f)
                lineTo(17.41f, 14.007f)
                curveTo(17.206f, 14.044f, 17.045f, 14.205f, 17.008f, 14.409f)
                lineTo(17f, 14.499f)
                lineTo(17f, 16.999f)
                lineTo(14.498f, 17f)
                lineTo(14.408f, 17.008f)
                curveTo(14.204f, 17.045f, 14.043f, 17.206f, 14.006f, 17.41f)
                lineTo(13.998f, 17.5f)
                lineTo(14.006f, 17.59f)
                curveTo(14.043f, 17.794f, 14.204f, 17.955f, 14.408f, 17.992f)
                lineTo(14.498f, 18f)
                lineTo(17.001f, 17.999f)
                lineTo(17.001f, 20.503f)
                lineTo(17.009f, 20.593f)
                curveTo(17.046f, 20.798f, 17.207f, 20.958f, 17.411f, 20.995f)
                lineTo(17.501f, 21.003f)
                lineTo(17.591f, 20.995f)
                curveTo(17.795f, 20.958f, 17.956f, 20.798f, 17.993f, 20.593f)
                lineTo(18.001f, 20.503f)
                lineTo(18.001f, 17.999f)
                lineTo(20.505f, 18f)
                lineTo(20.594f, 17.992f)
                curveTo(20.799f, 17.955f, 20.959f, 17.794f, 20.997f, 17.59f)
                lineTo(21.005f, 17.5f)
                lineTo(20.997f, 17.41f)
                curveTo(20.959f, 17.206f, 20.799f, 17.045f, 20.594f, 17.008f)
                lineTo(20.505f, 17f)
                lineTo(18f, 16.999f)
                lineTo(18f, 14.499f)
                lineTo(17.992f, 14.409f)
                curveTo(17.955f, 14.205f, 17.794f, 14.044f, 17.59f, 14.007f)
                lineTo(17.5f, 13.999f)
                close()
                moveTo(14.254f, 10f)
                curveTo(15.089f, 10f, 15.817f, 10.454f, 16.205f, 11.129f)
                curveTo(13.235f, 11.73f, 11f, 14.354f, 11f, 17.5f)
                curveTo(11f, 18.789f, 11.375f, 19.991f, 12.023f, 21.001f)
                lineTo(12.003f, 21f)
                curveTo(9.517f, 21f, 7.502f, 18.985f, 7.502f, 16.499f)
                verticalLineTo(12.25f)
                curveTo(7.502f, 11.007f, 8.509f, 10f, 9.752f, 10f)
                horizontalLineTo(14.254f)
                close()
                moveTo(7.406f, 10f)
                curveTo(6.893f, 10.535f, 6.561f, 11.246f, 6.509f, 12.033f)
                lineTo(6.502f, 12.25f)
                verticalLineTo(16.499f)
                curveTo(6.502f, 17.346f, 6.693f, 18.148f, 7.035f, 18.864f)
                curveTo(6.706f, 18.953f, 6.359f, 19f, 6.001f, 19f)
                curveTo(3.791f, 19f, 2f, 17.209f, 2f, 14.999f)
                verticalLineTo(12.25f)
                curveTo(2f, 11.059f, 2.925f, 10.084f, 4.096f, 10.005f)
                lineTo(4.25f, 10f)
                lineTo(7.406f, 10f)
                close()
                moveTo(19.75f, 10f)
                curveTo(20.993f, 10f, 22f, 11.007f, 22f, 12.25f)
                lineTo(22.001f, 12.81f)
                curveTo(20.833f, 11.689f, 19.247f, 11f, 17.5f, 11f)
                lineTo(17.257f, 11.005f)
                curveTo(17.101f, 10.63f, 16.877f, 10.289f, 16.6f, 10f)
                lineTo(19.75f, 10f)
                close()
                moveTo(18.5f, 4f)
                curveTo(19.881f, 4f, 21f, 5.119f, 21f, 6.5f)
                curveTo(21f, 7.881f, 19.881f, 9f, 18.5f, 9f)
                curveTo(17.119f, 9f, 16f, 7.881f, 16f, 6.5f)
                curveTo(16f, 5.119f, 17.119f, 4f, 18.5f, 4f)
                close()
                moveTo(12f, 3f)
                curveTo(13.657f, 3f, 15f, 4.343f, 15f, 6f)
                curveTo(15f, 7.657f, 13.657f, 9f, 12f, 9f)
                curveTo(10.343f, 9f, 9f, 7.657f, 9f, 6f)
                curveTo(9f, 4.343f, 10.343f, 3f, 12f, 3f)
                close()
                moveTo(5.5f, 4f)
                curveTo(6.881f, 4f, 8f, 5.119f, 8f, 6.5f)
                curveTo(8f, 7.881f, 6.881f, 9f, 5.5f, 9f)
                curveTo(4.119f, 9f, 3f, 7.881f, 3f, 6.5f)
                curveTo(3f, 5.119f, 4.119f, 4f, 5.5f, 4f)
                close()
            }
        }.build()

        return _PeopleTeamAdd!!
    }

@Suppress("ObjectPropertyName")
private var _PeopleTeamAdd: ImageVector? = null

@Preview
@Composable
private fun PeopleTeamAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PeopleTeamAdd, contentDescription = null)
    }
}
