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

public val FluentIcons.Regular.CubeCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CubeCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.049f, 7.984f)
            curveTo(6.196f, 7.597f, 6.629f, 7.402f, 7.016f, 7.549f)
            lineTo(12f, 9.44f)
            lineTo(16.984f, 7.549f)
            curveTo(17.371f, 7.402f, 17.804f, 7.597f, 17.951f, 7.984f)
            curveTo(18.098f, 8.371f, 17.903f, 8.804f, 17.516f, 8.951f)
            lineTo(12.75f, 10.759f)
            verticalLineTo(13.063f)
            curveTo(12.058f, 13.804f, 11.537f, 14.707f, 11.25f, 15.709f)
            verticalLineTo(10.759f)
            lineTo(6.484f, 8.951f)
            curveTo(6.097f, 8.804f, 5.902f, 8.371f, 6.049f, 7.984f)
            close()
            moveTo(20.5f, 7.174f)
            verticalLineTo(11.732f)
            curveTo(21.051f, 12.019f, 21.556f, 12.383f, 22f, 12.81f)
            verticalLineTo(7.174f)
            curveTo(22f, 6.461f, 21.568f, 5.82f, 20.907f, 5.552f)
            lineTo(13.409f, 2.512f)
            curveTo(12.505f, 2.146f, 11.495f, 2.146f, 10.591f, 2.512f)
            lineTo(3.093f, 5.552f)
            curveTo(2.432f, 5.82f, 2f, 6.461f, 2f, 7.174f)
            verticalLineTo(16.826f)
            curveTo(2f, 17.539f, 2.432f, 18.181f, 3.093f, 18.448f)
            lineTo(10.591f, 21.488f)
            curveTo(11.219f, 21.743f, 11.898f, 21.82f, 12.557f, 21.721f)
            curveTo(12.173f, 21.272f, 11.849f, 20.77f, 11.598f, 20.227f)
            curveTo(11.447f, 20.199f, 11.299f, 20.156f, 11.155f, 20.098f)
            lineTo(3.656f, 17.058f)
            curveTo(3.562f, 17.02f, 3.5f, 16.928f, 3.5f, 16.826f)
            verticalLineTo(7.174f)
            curveTo(3.5f, 7.072f, 3.562f, 6.98f, 3.656f, 6.942f)
            lineTo(11.155f, 3.902f)
            curveTo(11.697f, 3.682f, 12.303f, 3.682f, 12.845f, 3.902f)
            lineTo(20.344f, 6.942f)
            curveTo(20.438f, 6.98f, 20.5f, 7.072f, 20.5f, 7.174f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
            curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
            curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
            curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
            close()
            moveTo(16.854f, 19.854f)
            lineTo(20.854f, 15.854f)
            curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
            curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
            lineTo(16.5f, 18.793f)
            lineTo(14.854f, 17.146f)
            curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
            curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
            lineTo(16.146f, 19.854f)
            curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CubeCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CubeCheckmark, contentDescription = null)
    }
}
