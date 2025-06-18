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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.CameraOff: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CameraOff",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.28f, 2.22f)
            curveTo(2.987f, 1.927f, 2.513f, 1.927f, 2.22f, 2.22f)
            curveTo(1.927f, 2.513f, 1.927f, 2.987f, 2.22f, 3.28f)
            lineTo(4.135f, 5.196f)
            curveTo(2.889f, 5.651f, 2f, 6.847f, 2f, 8.25f)
            verticalLineTo(17.75f)
            curveTo(2f, 19.545f, 3.455f, 21f, 5.25f, 21f)
            horizontalLineTo(18.75f)
            curveTo(19.108f, 21f, 19.452f, 20.942f, 19.774f, 20.835f)
            lineTo(20.719f, 21.781f)
            curveTo(21.012f, 22.073f, 21.487f, 22.073f, 21.78f, 21.781f)
            curveTo(22.073f, 21.488f, 22.073f, 21.013f, 21.78f, 20.72f)
            lineTo(3.28f, 2.22f)
            close()
            moveTo(18.439f, 19.5f)
            horizontalLineTo(5.25f)
            curveTo(4.284f, 19.5f, 3.5f, 18.716f, 3.5f, 17.75f)
            verticalLineTo(8.25f)
            curveTo(3.5f, 7.284f, 4.284f, 6.5f, 5.25f, 6.5f)
            horizontalLineTo(5.439f)
            lineTo(8.55f, 9.611f)
            curveTo(7.895f, 10.392f, 7.5f, 11.4f, 7.5f, 12.5f)
            curveTo(7.5f, 14.985f, 9.515f, 17f, 12f, 17f)
            curveTo(13.1f, 17f, 14.108f, 16.605f, 14.889f, 15.95f)
            lineTo(18.439f, 19.5f)
            close()
            moveTo(9.617f, 10.678f)
            lineTo(13.822f, 14.883f)
            curveTo(13.317f, 15.27f, 12.685f, 15.5f, 12f, 15.5f)
            curveTo(10.343f, 15.5f, 9f, 14.157f, 9f, 12.5f)
            curveTo(9f, 11.814f, 9.23f, 11.183f, 9.617f, 10.678f)
            close()
            moveTo(11.245f, 8.063f)
            lineTo(12.786f, 9.604f)
            curveTo(13.811f, 9.882f, 14.618f, 10.689f, 14.896f, 11.714f)
            lineTo(16.437f, 13.255f)
            curveTo(16.478f, 13.01f, 16.5f, 12.757f, 16.5f, 12.5f)
            curveTo(16.5f, 10.015f, 14.485f, 8f, 12f, 8f)
            curveTo(11.743f, 8f, 11.49f, 8.022f, 11.245f, 8.063f)
            close()
            moveTo(20.5f, 8.25f)
            verticalLineTo(17.318f)
            lineTo(21.864f, 18.683f)
            curveTo(21.953f, 18.387f, 22f, 18.074f, 22f, 17.75f)
            verticalLineTo(8.25f)
            curveTo(22f, 6.455f, 20.545f, 5f, 18.75f, 5f)
            horizontalLineTo(16.679f)
            lineTo(15.865f, 3.613f)
            curveTo(15.461f, 2.926f, 14.722f, 2.503f, 13.925f, 2.503f)
            horizontalLineTo(10.122f)
            curveTo(9.34f, 2.503f, 8.614f, 2.909f, 8.205f, 3.576f)
            lineTo(7.654f, 4.472f)
            lineTo(8.745f, 5.563f)
            lineTo(9.483f, 4.361f)
            lineTo(9.548f, 4.271f)
            curveTo(9.689f, 4.103f, 9.899f, 4.003f, 10.122f, 4.003f)
            horizontalLineTo(13.925f)
            curveTo(14.191f, 4.003f, 14.437f, 4.144f, 14.571f, 4.373f)
            lineTo(15.603f, 6.13f)
            curveTo(15.738f, 6.359f, 15.984f, 6.5f, 16.25f, 6.5f)
            horizontalLineTo(18.75f)
            curveTo(19.716f, 6.5f, 20.5f, 7.284f, 20.5f, 8.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CameraOffPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CameraOff, contentDescription = null)
    }
}
