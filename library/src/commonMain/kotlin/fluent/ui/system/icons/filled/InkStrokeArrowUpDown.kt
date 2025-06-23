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

public val FluentIcons.Filled.InkStrokeArrowUpDown: ImageVector
    get() {
        if (_InkStrokeArrowUpDown != null) {
            return _InkStrokeArrowUpDown!!
        }
        _InkStrokeArrowUpDown = ImageVector.Builder(
            name = "Filled.InkStrokeArrowUpDown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(3.004f, 2.907f)
                curveTo(3.056f, 2.357f, 3.543f, 1.953f, 4.093f, 2.004f)
                lineTo(7.84f, 2.354f)
                curveTo(10.495f, 2.618f, 13.042f, 2.935f, 15.135f, 3.296f)
                curveTo(17.177f, 3.647f, 18.933f, 4.062f, 19.897f, 4.571f)
                curveTo(20.146f, 4.702f, 20.419f, 4.878f, 20.63f, 5.119f)
                curveTo(20.855f, 5.376f, 21.068f, 5.782f, 20.979f, 6.285f)
                curveTo(20.898f, 6.743f, 20.603f, 7.052f, 20.367f, 7.238f)
                curveTo(20.12f, 7.432f, 19.815f, 7.589f, 19.491f, 7.724f)
                curveTo(18.222f, 8.249f, 15.83f, 8.746f, 12.099f, 9.234f)
                curveTo(10.417f, 9.454f, 9.176f, 9.669f, 8.298f, 9.87f)
                curveTo(8.509f, 9.916f, 8.736f, 9.962f, 8.979f, 10.006f)
                curveTo(10.195f, 10.23f, 11.729f, 10.421f, 13.36f, 10.567f)
                curveTo(14.606f, 10.679f, 15.942f, 10.855f, 17.083f, 11.081f)
                lineTo(17.089f, 11.082f)
                lineTo(15.586f, 12.586f)
                curveTo(15.512f, 12.66f, 15.445f, 12.738f, 15.386f, 12.819f)
                curveTo(14.667f, 12.713f, 13.912f, 12.624f, 13.182f, 12.559f)
                curveTo(11.515f, 12.41f, 9.915f, 12.212f, 8.617f, 11.973f)
                curveTo(7.969f, 11.854f, 7.381f, 11.722f, 6.889f, 11.576f)
                curveTo(6.423f, 11.438f, 5.95f, 11.262f, 5.604f, 11.016f)
                curveTo(5.432f, 10.894f, 5.193f, 10.688f, 5.057f, 10.367f)
                curveTo(4.895f, 9.985f, 4.937f, 9.578f, 5.131f, 9.243f)
                curveTo(5.295f, 8.961f, 5.539f, 8.776f, 5.732f, 8.656f)
                curveTo(5.939f, 8.529f, 6.18f, 8.42f, 6.437f, 8.324f)
                curveTo(7.443f, 7.951f, 9.196f, 7.597f, 11.84f, 7.251f)
                curveTo(15.072f, 6.828f, 17.11f, 6.418f, 18.247f, 6.05f)
                curveTo(17.47f, 5.793f, 16.298f, 5.525f, 14.796f, 5.267f)
                curveTo(12.768f, 4.917f, 10.274f, 4.606f, 7.645f, 4.345f)
                lineTo(3.907f, 3.996f)
                curveTo(3.357f, 3.944f, 2.953f, 3.457f, 3.004f, 2.907f)
                close()
                moveTo(15.586f, 15.414f)
                curveTo(15.604f, 15.432f, 15.622f, 15.45f, 15.641f, 15.467f)
                curveTo(15.106f, 15.547f, 14.519f, 15.625f, 13.877f, 15.701f)
                curveTo(11.266f, 16.013f, 9.698f, 16.408f, 8.841f, 16.797f)
                curveTo(8.499f, 16.953f, 8.328f, 17.082f, 8.25f, 17.157f)
                curveTo(8.281f, 17.203f, 8.336f, 17.273f, 8.431f, 17.364f)
                curveTo(8.611f, 17.537f, 8.875f, 17.73f, 9.217f, 17.932f)
                curveTo(9.899f, 18.335f, 10.781f, 18.71f, 11.634f, 19.002f)
                lineTo(14.879f, 20.048f)
                curveTo(15.404f, 20.217f, 15.693f, 20.781f, 15.524f, 21.306f)
                curveTo(15.354f, 21.832f, 14.791f, 22.121f, 14.265f, 21.951f)
                lineTo(11.004f, 20.9f)
                lineTo(10.995f, 20.897f)
                curveTo(10.063f, 20.579f, 9.041f, 20.151f, 8.2f, 19.654f)
                curveTo(7.78f, 19.406f, 7.377f, 19.124f, 7.048f, 18.809f)
                curveTo(6.729f, 18.504f, 6.408f, 18.099f, 6.277f, 17.595f)
                curveTo(6.13f, 17.031f, 6.254f, 16.467f, 6.617f, 15.991f)
                curveTo(6.946f, 15.56f, 7.443f, 15.235f, 8.015f, 14.976f)
                curveTo(9.162f, 14.455f, 10.982f, 14.033f, 13.64f, 13.716f)
                curveTo(14.155f, 13.654f, 14.626f, 13.593f, 15.055f, 13.531f)
                curveTo(14.898f, 14.186f, 15.075f, 14.904f, 15.586f, 15.414f)
                close()
                moveTo(20.207f, 10.793f)
                curveTo(19.817f, 10.402f, 19.183f, 10.402f, 18.793f, 10.793f)
                lineTo(16.293f, 13.293f)
                curveTo(15.902f, 13.683f, 15.902f, 14.317f, 16.293f, 14.707f)
                curveTo(16.683f, 15.098f, 17.317f, 15.098f, 17.707f, 14.707f)
                lineTo(18.5f, 13.914f)
                verticalLineTo(19.586f)
                lineTo(17.707f, 18.793f)
                curveTo(17.317f, 18.402f, 16.683f, 18.402f, 16.293f, 18.793f)
                curveTo(15.902f, 19.183f, 15.902f, 19.817f, 16.293f, 20.207f)
                lineTo(18.793f, 22.707f)
                curveTo(19.183f, 23.098f, 19.817f, 23.098f, 20.207f, 22.707f)
                lineTo(22.707f, 20.207f)
                curveTo(23.098f, 19.817f, 23.098f, 19.183f, 22.707f, 18.793f)
                curveTo(22.317f, 18.402f, 21.683f, 18.402f, 21.293f, 18.793f)
                lineTo(20.5f, 19.586f)
                verticalLineTo(13.914f)
                lineTo(21.293f, 14.707f)
                curveTo(21.683f, 15.098f, 22.317f, 15.098f, 22.707f, 14.707f)
                curveTo(23.098f, 14.317f, 23.098f, 13.683f, 22.707f, 13.293f)
                lineTo(20.207f, 10.793f)
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
        Image(imageVector = FluentIcons.Filled.InkStrokeArrowUpDown, contentDescription = null)
    }
}
