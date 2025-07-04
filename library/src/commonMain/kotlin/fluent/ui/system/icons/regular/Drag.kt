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

public val FluentIcons.Regular.Drag: ImageVector
    get() {
        if (_Drag != null) {
            return _Drag!!
        }
        _Drag = ImageVector.Builder(
            name = "Regular.Drag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12.001f, 16.5f)
                curveTo(12.38f, 16.5f, 12.694f, 16.782f, 12.744f, 17.148f)
                lineTo(12.751f, 17.25f)
                verticalLineTo(19.438f)
                lineTo(13.47f, 18.719f)
                curveTo(13.736f, 18.453f, 14.153f, 18.429f, 14.447f, 18.647f)
                lineTo(14.531f, 18.719f)
                curveTo(14.797f, 18.986f, 14.821f, 19.402f, 14.604f, 19.696f)
                lineTo(14.531f, 19.78f)
                lineTo(12.531f, 21.78f)
                lineTo(12.493f, 21.816f)
                lineTo(12.421f, 21.871f)
                lineTo(12.326f, 21.926f)
                lineTo(12.239f, 21.961f)
                lineTo(12.137f, 21.987f)
                lineTo(12.052f, 21.998f)
                horizontalLineTo(11.949f)
                lineTo(11.829f, 21.98f)
                lineTo(11.761f, 21.961f)
                lineTo(11.702f, 21.938f)
                lineTo(11.632f, 21.903f)
                lineTo(11.58f, 21.871f)
                lineTo(11.549f, 21.849f)
                curveTo(11.521f, 21.828f, 11.495f, 21.805f, 11.47f, 21.78f)
                lineTo(9.47f, 19.78f)
                curveTo(9.177f, 19.487f, 9.177f, 19.012f, 9.47f, 18.719f)
                curveTo(9.737f, 18.453f, 10.153f, 18.429f, 10.447f, 18.647f)
                lineTo(10.531f, 18.719f)
                lineTo(11.251f, 19.439f)
                verticalLineTo(17.25f)
                curveTo(11.251f, 16.87f, 11.533f, 16.556f, 11.899f, 16.507f)
                lineTo(12.001f, 16.5f)
                close()
                moveTo(12.001f, 9f)
                curveTo(13.657f, 9f, 15.001f, 10.343f, 15.001f, 12f)
                curveTo(15.001f, 13.657f, 13.657f, 15f, 12.001f, 15f)
                curveTo(10.344f, 15f, 9.001f, 13.657f, 9.001f, 12f)
                curveTo(9.001f, 10.343f, 10.344f, 9f, 12.001f, 9f)
                close()
                moveTo(18.72f, 9.469f)
                curveTo(18.986f, 9.203f, 19.403f, 9.179f, 19.697f, 9.397f)
                lineTo(19.781f, 9.469f)
                lineTo(21.781f, 11.469f)
                lineTo(21.816f, 11.508f)
                lineTo(21.872f, 11.58f)
                lineTo(21.927f, 11.675f)
                lineTo(21.962f, 11.761f)
                lineTo(21.988f, 11.863f)
                lineTo(21.999f, 11.948f)
                verticalLineTo(12.051f)
                lineTo(21.981f, 12.171f)
                lineTo(21.962f, 12.239f)
                lineTo(21.939f, 12.298f)
                lineTo(21.904f, 12.369f)
                lineTo(21.872f, 12.42f)
                lineTo(21.844f, 12.458f)
                lineTo(21.781f, 12.53f)
                lineTo(19.781f, 14.53f)
                curveTo(19.488f, 14.823f, 19.013f, 14.823f, 18.72f, 14.53f)
                curveTo(18.454f, 14.264f, 18.43f, 13.847f, 18.648f, 13.554f)
                lineTo(18.72f, 13.469f)
                lineTo(19.439f, 12.75f)
                horizontalLineTo(17.251f)
                curveTo(16.871f, 12.75f, 16.557f, 12.468f, 16.507f, 12.102f)
                lineTo(16.501f, 12f)
                curveTo(16.501f, 11.62f, 16.783f, 11.306f, 17.149f, 11.257f)
                lineTo(17.251f, 11.25f)
                horizontalLineTo(19.44f)
                lineTo(18.72f, 10.53f)
                curveTo(18.454f, 10.264f, 18.43f, 9.847f, 18.648f, 9.554f)
                lineTo(18.72f, 9.469f)
                close()
                moveTo(4.22f, 9.469f)
                curveTo(4.513f, 9.177f, 4.988f, 9.177f, 5.281f, 9.469f)
                curveTo(5.547f, 9.736f, 5.571f, 10.152f, 5.354f, 10.446f)
                lineTo(5.281f, 10.53f)
                lineTo(4.561f, 11.25f)
                horizontalLineTo(6.751f)
                curveTo(7.13f, 11.25f, 7.444f, 11.532f, 7.494f, 11.898f)
                lineTo(7.501f, 12f)
                curveTo(7.501f, 12.38f, 7.218f, 12.693f, 6.852f, 12.743f)
                lineTo(6.751f, 12.75f)
                horizontalLineTo(4.562f)
                lineTo(5.281f, 13.469f)
                curveTo(5.547f, 13.736f, 5.571f, 14.152f, 5.354f, 14.446f)
                lineTo(5.281f, 14.53f)
                curveTo(5.015f, 14.796f, 4.598f, 14.821f, 4.304f, 14.603f)
                lineTo(4.22f, 14.53f)
                lineTo(2.22f, 12.53f)
                lineTo(2.129f, 12.42f)
                lineTo(2.075f, 12.325f)
                lineTo(2.039f, 12.238f)
                lineTo(2.013f, 12.136f)
                lineTo(2.002f, 12.045f)
                lineTo(2.002f, 11.953f)
                lineTo(2.02f, 11.828f)
                lineTo(2.04f, 11.76f)
                lineTo(2.062f, 11.702f)
                lineTo(2.097f, 11.631f)
                lineTo(2.129f, 11.58f)
                lineTo(2.152f, 11.548f)
                curveTo(2.173f, 11.52f, 2.196f, 11.494f, 2.22f, 11.469f)
                lineTo(4.22f, 9.469f)
                close()
                moveTo(12.001f, 10.5f)
                curveTo(11.172f, 10.5f, 10.501f, 11.171f, 10.501f, 12f)
                curveTo(10.501f, 12.828f, 11.172f, 13.5f, 12.001f, 13.5f)
                curveTo(12.829f, 13.5f, 13.501f, 12.828f, 13.501f, 12f)
                curveTo(13.501f, 11.171f, 12.829f, 10.5f, 12.001f, 10.5f)
                close()
                moveTo(11.864f, 2.012f)
                lineTo(11.931f, 2.003f)
                lineTo(12.018f, 2f)
                lineTo(12.078f, 2.004f)
                lineTo(12.172f, 2.02f)
                lineTo(12.24f, 2.039f)
                lineTo(12.299f, 2.061f)
                lineTo(12.37f, 2.097f)
                lineTo(12.421f, 2.129f)
                lineTo(12.459f, 2.156f)
                lineTo(12.531f, 2.219f)
                lineTo(14.531f, 4.219f)
                curveTo(14.824f, 4.512f, 14.824f, 4.987f, 14.531f, 5.28f)
                curveTo(14.265f, 5.546f, 13.848f, 5.571f, 13.554f, 5.353f)
                lineTo(13.47f, 5.28f)
                lineTo(12.751f, 4.561f)
                verticalLineTo(6.75f)
                curveTo(12.751f, 7.129f, 12.468f, 7.443f, 12.102f, 7.493f)
                lineTo(12.001f, 7.5f)
                curveTo(11.621f, 7.5f, 11.307f, 7.218f, 11.257f, 6.852f)
                lineTo(11.251f, 6.75f)
                verticalLineTo(4.56f)
                lineTo(10.531f, 5.28f)
                curveTo(10.265f, 5.546f, 9.848f, 5.571f, 9.554f, 5.353f)
                lineTo(9.47f, 5.28f)
                curveTo(9.204f, 5.014f, 9.18f, 4.597f, 9.398f, 4.304f)
                lineTo(9.47f, 4.219f)
                lineTo(11.47f, 2.219f)
                lineTo(11.58f, 2.128f)
                lineTo(11.675f, 2.074f)
                lineTo(11.762f, 2.039f)
                lineTo(11.864f, 2.012f)
                close()
            }
        }.build()

        return _Drag!!
    }

@Suppress("ObjectPropertyName")
private var _Drag: ImageVector? = null

@Preview
@Composable
private fun DragPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Drag, contentDescription = null)
    }
}
