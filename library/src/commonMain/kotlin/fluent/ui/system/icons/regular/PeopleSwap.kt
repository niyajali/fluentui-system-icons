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

public val FluentUi.Regular.PeopleSwap: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PeopleSwap",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(8f, 5.5f)
            curveTo(6.619f, 5.5f, 5.5f, 6.619f, 5.5f, 8f)
            curveTo(5.5f, 9.381f, 6.619f, 10.5f, 8f, 10.5f)
            curveTo(9.381f, 10.5f, 10.5f, 9.381f, 10.5f, 8f)
            curveTo(10.5f, 6.619f, 9.381f, 5.5f, 8f, 5.5f)
            close()
            moveTo(4f, 8f)
            curveTo(4f, 5.791f, 5.791f, 4f, 8f, 4f)
            curveTo(10.209f, 4f, 12f, 5.791f, 12f, 8f)
            curveTo(12f, 10.209f, 10.209f, 12f, 8f, 12f)
            curveTo(5.791f, 12f, 4f, 10.209f, 4f, 8f)
            close()
            moveTo(17f, 7.5f)
            curveTo(16.172f, 7.5f, 15.5f, 8.172f, 15.5f, 9f)
            curveTo(15.5f, 9.828f, 16.172f, 10.5f, 17f, 10.5f)
            curveTo(17.828f, 10.5f, 18.5f, 9.828f, 18.5f, 9f)
            curveTo(18.5f, 8.172f, 17.828f, 7.5f, 17f, 7.5f)
            close()
            moveTo(14f, 9f)
            curveTo(14f, 7.343f, 15.343f, 6f, 17f, 6f)
            curveTo(18.657f, 6f, 20f, 7.343f, 20f, 9f)
            curveTo(20f, 10.657f, 18.657f, 12f, 17f, 12f)
            curveTo(15.343f, 12f, 14f, 10.657f, 14f, 9f)
            close()
            moveTo(12.777f, 14.248f)
            curveTo(12.469f, 14.089f, 12.12f, 14f, 11.75f, 14f)
            horizontalLineTo(4.25f)
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
            curveTo(9.608f, 21f, 10.807f, 20.668f, 11.692f, 20.167f)
            lineTo(10.575f, 19.05f)
            curveTo(9.957f, 19.317f, 9.125f, 19.5f, 8f, 19.5f)
            curveTo(5.578f, 19.5f, 4.514f, 18.65f, 4.021f, 17.945f)
            curveTo(3.76f, 17.572f, 3.628f, 17.197f, 3.562f, 16.916f)
            curveTo(3.53f, 16.775f, 3.514f, 16.661f, 3.507f, 16.587f)
            curveTo(3.503f, 16.549f, 3.501f, 16.522f, 3.5f, 16.507f)
            lineTo(3.5f, 16.495f)
            verticalLineTo(16.25f)
            curveTo(3.5f, 15.836f, 3.836f, 15.5f, 4.25f, 15.5f)
            horizontalLineTo(11.525f)
            lineTo(12.777f, 14.248f)
            close()
            moveTo(20.281f, 14.72f)
            curveTo(19.988f, 14.427f, 19.513f, 14.427f, 19.22f, 14.72f)
            curveTo(18.927f, 15.013f, 18.927f, 15.488f, 19.22f, 15.781f)
            lineTo(20.439f, 17f)
            horizontalLineTo(13.561f)
            lineTo(14.78f, 15.781f)
            curveTo(15.073f, 15.488f, 15.073f, 15.013f, 14.78f, 14.72f)
            curveTo(14.487f, 14.427f, 14.012f, 14.427f, 13.719f, 14.72f)
            lineTo(11.22f, 17.22f)
            curveTo(10.927f, 17.513f, 10.927f, 17.987f, 11.22f, 18.28f)
            lineTo(13.719f, 20.78f)
            curveTo(14.012f, 21.073f, 14.487f, 21.073f, 14.78f, 20.78f)
            curveTo(15.073f, 20.487f, 15.073f, 20.012f, 14.78f, 19.719f)
            lineTo(13.561f, 18.5f)
            horizontalLineTo(20.439f)
            lineTo(19.22f, 19.719f)
            curveTo(18.927f, 20.012f, 18.927f, 20.487f, 19.22f, 20.78f)
            curveTo(19.513f, 21.073f, 19.988f, 21.073f, 20.281f, 20.78f)
            lineTo(22.78f, 18.28f)
            curveTo(23.073f, 17.987f, 23.073f, 17.513f, 22.78f, 17.22f)
            lineTo(20.281f, 14.72f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleSwapPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.PeopleSwap, contentDescription = null)
    }
}
