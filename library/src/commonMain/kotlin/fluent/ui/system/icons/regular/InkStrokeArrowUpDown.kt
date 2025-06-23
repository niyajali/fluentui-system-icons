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

public val FluentIcons.Regular.InkStrokeArrowUpDown: ImageVector
    get() {
        if (_InkStrokeArrowUpDown != null) {
            return _InkStrokeArrowUpDown!!
        }
        _InkStrokeArrowUpDown = ImageVector.Builder(
            name = "Regular.InkStrokeArrowUpDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.253f, 2.93f)
                curveTo(3.292f, 2.518f, 3.657f, 2.215f, 4.07f, 2.253f)
                lineTo(7.815f, 2.603f)
                curveTo(10.467f, 2.866f, 13.008f, 3.183f, 15.093f, 3.542f)
                curveTo(17.14f, 3.895f, 18.857f, 4.304f, 19.781f, 4.792f)
                curveTo(20.018f, 4.917f, 20.26f, 5.076f, 20.442f, 5.284f)
                curveTo(20.635f, 5.504f, 20.805f, 5.836f, 20.733f, 6.241f)
                curveTo(20.667f, 6.613f, 20.426f, 6.873f, 20.212f, 7.041f)
                curveTo(19.991f, 7.216f, 19.709f, 7.363f, 19.395f, 7.493f)
                curveTo(18.161f, 8.004f, 15.8f, 8.498f, 12.067f, 8.986f)
                curveTo(9.687f, 9.298f, 8.172f, 9.601f, 7.309f, 9.875f)
                curveTo(7.334f, 9.883f, 7.36f, 9.891f, 7.386f, 9.899f)
                curveTo(7.797f, 10.02f, 8.32f, 10.139f, 8.934f, 10.252f)
                curveTo(10.16f, 10.477f, 11.702f, 10.67f, 13.338f, 10.816f)
                curveTo(14.578f, 10.927f, 15.905f, 11.103f, 17.035f, 11.326f)
                curveTo(17.222f, 11.363f, 17.405f, 11.402f, 17.583f, 11.442f)
                lineTo(16.309f, 12.716f)
                curveTo(15.341f, 12.543f, 14.246f, 12.403f, 13.204f, 12.31f)
                curveTo(11.542f, 12.161f, 9.95f, 11.964f, 8.663f, 11.727f)
                curveTo(8.019f, 11.609f, 7.44f, 11.479f, 6.96f, 11.337f)
                curveTo(6.499f, 11.2f, 6.06f, 11.033f, 5.748f, 10.812f)
                curveTo(5.594f, 10.702f, 5.398f, 10.529f, 5.288f, 10.27f)
                curveTo(5.158f, 9.964f, 5.191f, 9.639f, 5.348f, 9.369f)
                curveTo(5.482f, 9.137f, 5.686f, 8.979f, 5.864f, 8.869f)
                curveTo(6.051f, 8.753f, 6.275f, 8.651f, 6.524f, 8.559f)
                curveTo(7.501f, 8.196f, 9.229f, 7.845f, 11.872f, 7.499f)
                curveTo(15.62f, 7.009f, 17.794f, 6.533f, 18.821f, 6.107f)
                curveTo(18.867f, 6.088f, 18.908f, 6.07f, 18.947f, 6.052f)
                curveTo(18.215f, 5.712f, 16.787f, 5.356f, 14.839f, 5.02f)
                curveTo(12.802f, 4.67f, 10.302f, 4.357f, 7.669f, 4.096f)
                lineTo(3.93f, 3.747f)
                curveTo(3.518f, 3.708f, 3.215f, 3.343f, 3.253f, 2.93f)
                close()
                moveTo(15.586f, 13.706f)
                curveTo(15.426f, 14.198f, 15.489f, 14.747f, 15.776f, 15.194f)
                curveTo(15.2f, 15.282f, 14.559f, 15.368f, 13.848f, 15.453f)
                curveTo(11.23f, 15.766f, 9.631f, 16.164f, 8.738f, 16.569f)
                curveTo(8.29f, 16.773f, 8.088f, 16.948f, 8.008f, 17.053f)
                curveTo(7.959f, 17.117f, 7.965f, 17.136f, 7.969f, 17.15f)
                lineTo(7.971f, 17.154f)
                curveTo(7.986f, 17.214f, 8.052f, 17.347f, 8.258f, 17.545f)
                curveTo(8.457f, 17.735f, 8.738f, 17.939f, 9.09f, 18.147f)
                curveTo(9.792f, 18.562f, 10.691f, 18.944f, 11.556f, 19.24f)
                lineTo(14.802f, 20.286f)
                curveTo(15.196f, 20.413f, 15.413f, 20.836f, 15.286f, 21.23f)
                curveTo(15.159f, 21.624f, 14.736f, 21.841f, 14.342f, 21.714f)
                lineTo(11.076f, 20.661f)
                curveTo(10.153f, 20.345f, 9.148f, 19.924f, 8.327f, 19.439f)
                curveTo(7.917f, 19.196f, 7.531f, 18.926f, 7.221f, 18.628f)
                curveTo(6.918f, 18.339f, 6.634f, 17.973f, 6.519f, 17.532f)
                curveTo(6.393f, 17.047f, 6.497f, 16.561f, 6.816f, 16.143f)
                curveTo(7.109f, 15.758f, 7.564f, 15.455f, 8.118f, 15.204f)
                curveTo(9.229f, 14.699f, 11.017f, 14.281f, 13.67f, 13.964f)
                curveTo(14.391f, 13.878f, 15.027f, 13.792f, 15.586f, 13.706f)
                close()
                moveTo(20.28f, 11.22f)
                curveTo(19.987f, 10.927f, 19.513f, 10.927f, 19.22f, 11.22f)
                lineTo(16.72f, 13.72f)
                curveTo(16.427f, 14.013f, 16.427f, 14.487f, 16.72f, 14.78f)
                curveTo(17.013f, 15.073f, 17.487f, 15.073f, 17.78f, 14.78f)
                lineTo(19f, 13.561f)
                verticalLineTo(20.439f)
                lineTo(17.78f, 19.22f)
                curveTo(17.487f, 18.927f, 17.013f, 18.927f, 16.72f, 19.22f)
                curveTo(16.427f, 19.513f, 16.427f, 19.987f, 16.72f, 20.28f)
                lineTo(19.22f, 22.78f)
                curveTo(19.513f, 23.073f, 19.987f, 23.073f, 20.28f, 22.78f)
                lineTo(22.78f, 20.28f)
                curveTo(23.073f, 19.987f, 23.073f, 19.513f, 22.78f, 19.22f)
                curveTo(22.487f, 18.927f, 22.013f, 18.927f, 21.72f, 19.22f)
                lineTo(20.5f, 20.439f)
                verticalLineTo(13.561f)
                lineTo(21.72f, 14.78f)
                curveTo(22.013f, 15.073f, 22.487f, 15.073f, 22.78f, 14.78f)
                curveTo(23.073f, 14.487f, 23.073f, 14.013f, 22.78f, 13.72f)
                lineTo(20.28f, 11.22f)
                close()
            }
        }.build()

        return _InkStrokeArrowUpDown!!
    }

@Suppress("ObjectPropertyName")
private var _InkStrokeArrowUpDown: ImageVector? = null

@Preview
@Composable
private fun InkStrokeArrowUpDownPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.InkStrokeArrowUpDown, contentDescription = null)
    }
}
