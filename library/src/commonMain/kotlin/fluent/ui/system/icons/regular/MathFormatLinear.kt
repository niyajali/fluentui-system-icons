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

public val FluentIcons.Regular.MathFormatLinear: ImageVector
    get() {
        if (_MathFormatLinear != null) {
            return _MathFormatLinear!!
        }
        _MathFormatLinear = ImageVector.Builder(
            name = "Regular.MathFormatLinear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(10.988f, 4.181f)
                curveTo(10.707f, 3.94f, 10.293f, 3.94f, 10.012f, 4.181f)
                lineTo(8.262f, 5.681f)
                curveTo(7.947f, 5.95f, 7.911f, 6.424f, 8.181f, 6.738f)
                curveTo(8.45f, 7.053f, 8.924f, 7.089f, 9.238f, 6.819f)
                lineTo(10.5f, 5.738f)
                lineTo(11.762f, 6.819f)
                curveTo(12.076f, 7.089f, 12.55f, 7.053f, 12.819f, 6.738f)
                curveTo(13.089f, 6.424f, 13.053f, 5.95f, 12.738f, 5.681f)
                lineTo(10.988f, 4.181f)
                close()
                moveTo(13.56f, 9.543f)
                curveTo(13.926f, 9.23f, 14.488f, 9.337f, 14.712f, 9.763f)
                lineTo(15.907f, 12.033f)
                lineTo(12.22f, 15.72f)
                curveTo(11.927f, 16.013f, 11.927f, 16.487f, 12.22f, 16.78f)
                curveTo(12.513f, 17.073f, 12.988f, 17.073f, 13.28f, 16.78f)
                lineTo(16.638f, 13.423f)
                lineTo(17.961f, 15.935f)
                curveTo(18.633f, 17.213f, 20.319f, 17.536f, 21.416f, 16.596f)
                lineTo(21.738f, 16.319f)
                curveTo(22.053f, 16.05f, 22.089f, 15.576f, 21.819f, 15.262f)
                curveTo(21.55f, 14.947f, 21.076f, 14.911f, 20.762f, 15.181f)
                lineTo(20.44f, 15.457f)
                curveTo(20.074f, 15.77f, 19.512f, 15.663f, 19.288f, 15.237f)
                lineTo(17.749f, 12.312f)
                lineTo(20.78f, 9.28f)
                curveTo(21.073f, 8.987f, 21.073f, 8.513f, 20.78f, 8.22f)
                curveTo(20.487f, 7.927f, 20.013f, 7.927f, 19.72f, 8.22f)
                lineTo(17.017f, 10.922f)
                lineTo(16.039f, 9.065f)
                curveTo(15.367f, 7.786f, 13.681f, 7.464f, 12.584f, 8.404f)
                lineTo(12.262f, 8.681f)
                curveTo(11.947f, 8.95f, 11.911f, 9.424f, 12.181f, 9.738f)
                curveTo(12.45f, 10.053f, 12.924f, 10.089f, 13.238f, 9.819f)
                lineTo(13.56f, 9.543f)
                close()
                moveTo(3.586f, 13.469f)
                curveTo(4.512f, 13.456f, 5.478f, 13.405f, 6.347f, 13.217f)
                curveTo(7.395f, 12.991f, 8.433f, 12.539f, 9.063f, 11.586f)
                curveTo(9.627f, 10.734f, 9.644f, 9.715f, 9.12f, 8.954f)
                curveTo(8.587f, 8.18f, 7.609f, 7.832f, 6.52f, 8.079f)
                curveTo(6.063f, 8.183f, 5.265f, 8.423f, 4.445f, 9.089f)
                curveTo(3.62f, 9.758f, 2.817f, 10.821f, 2.292f, 12.498f)
                curveTo(1.902f, 13.741f, 1.905f, 14.828f, 2.285f, 15.697f)
                curveTo(2.672f, 16.58f, 3.406f, 17.134f, 4.253f, 17.368f)
                curveTo(5.903f, 17.823f, 7.98f, 17.093f, 9.307f, 15.418f)
                curveTo(9.564f, 15.093f, 9.51f, 14.621f, 9.185f, 14.364f)
                curveTo(8.86f, 14.107f, 8.388f, 14.162f, 8.131f, 14.486f)
                curveTo(7.112f, 15.773f, 5.626f, 16.191f, 4.652f, 15.922f)
                curveTo(4.187f, 15.793f, 3.844f, 15.517f, 3.659f, 15.095f)
                curveTo(3.503f, 14.738f, 3.432f, 14.208f, 3.586f, 13.469f)
                close()
                moveTo(7.885f, 9.804f)
                curveTo(8.024f, 10.007f, 8.077f, 10.358f, 7.812f, 10.758f)
                curveTo(7.495f, 11.237f, 6.913f, 11.56f, 6.03f, 11.751f)
                curveTo(5.451f, 11.876f, 4.798f, 11.932f, 4.107f, 11.956f)
                curveTo(4.5f, 11.129f, 4.964f, 10.599f, 5.39f, 10.254f)
                curveTo(5.971f, 9.782f, 6.527f, 9.616f, 6.852f, 9.542f)
                curveTo(7.443f, 9.408f, 7.755f, 9.616f, 7.885f, 9.804f)
                close()
            }
        }.build()

        return _MathFormatLinear!!
    }

@Suppress("ObjectPropertyName")
private var _MathFormatLinear: ImageVector? = null

@Preview
@Composable
private fun MathFormatLinearPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.MathFormatLinear, contentDescription = null)
    }
}
