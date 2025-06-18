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

public val FluentIcons.Regular.PlantCattail: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PlantCattail",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 2f)
            curveTo(10.343f, 2f, 9f, 3.343f, 9f, 5f)
            verticalLineTo(9f)
            curveTo(9f, 10.398f, 9.956f, 11.573f, 11.25f, 11.906f)
            verticalLineTo(14.689f)
            lineTo(7.78f, 11.22f)
            curveTo(7.487f, 10.927f, 7.013f, 10.927f, 6.72f, 11.22f)
            curveTo(6.427f, 11.513f, 6.427f, 11.987f, 6.72f, 12.28f)
            lineTo(11.25f, 16.811f)
            verticalLineTo(18.25f)
            curveTo(11.25f, 18.664f, 11.586f, 19f, 12f, 19f)
            curveTo(12.414f, 19f, 12.75f, 18.664f, 12.75f, 18.25f)
            verticalLineTo(16.811f)
            lineTo(17.28f, 12.28f)
            curveTo(17.573f, 11.987f, 17.573f, 11.513f, 17.28f, 11.22f)
            curveTo(16.987f, 10.927f, 16.513f, 10.927f, 16.22f, 11.22f)
            lineTo(12.75f, 14.689f)
            verticalLineTo(11.906f)
            curveTo(14.044f, 11.573f, 15f, 10.398f, 15f, 9f)
            verticalLineTo(5f)
            curveTo(15f, 3.343f, 13.657f, 2f, 12f, 2f)
            close()
            moveTo(10.5f, 5f)
            curveTo(10.5f, 4.172f, 11.172f, 3.5f, 12f, 3.5f)
            curveTo(12.828f, 3.5f, 13.5f, 4.172f, 13.5f, 5f)
            verticalLineTo(9f)
            curveTo(13.5f, 9.828f, 12.828f, 10.5f, 12f, 10.5f)
            curveTo(11.172f, 10.5f, 10.5f, 9.828f, 10.5f, 9f)
            verticalLineTo(5f)
            close()
            moveTo(5.891f, 15.004f)
            curveTo(6.385f, 14.809f, 6.933f, 14.639f, 7.522f, 14.497f)
            lineTo(8.791f, 15.766f)
            curveTo(7.9f, 15.921f, 7.104f, 16.139f, 6.441f, 16.4f)
            curveTo(5.746f, 16.673f, 5.235f, 16.981f, 4.909f, 17.284f)
            curveTo(4.585f, 17.586f, 4.5f, 17.828f, 4.5f, 18f)
            curveTo(4.5f, 18.172f, 4.585f, 18.414f, 4.909f, 18.716f)
            curveTo(5.235f, 19.019f, 5.746f, 19.326f, 6.441f, 19.6f)
            curveTo(7.827f, 20.146f, 9.792f, 20.5f, 12f, 20.5f)
            curveTo(14.208f, 20.5f, 16.173f, 20.146f, 17.559f, 19.6f)
            curveTo(18.254f, 19.326f, 18.765f, 19.019f, 19.09f, 18.716f)
            curveTo(19.415f, 18.414f, 19.5f, 18.172f, 19.5f, 18f)
            curveTo(19.5f, 17.828f, 19.415f, 17.586f, 19.09f, 17.284f)
            curveTo(18.765f, 16.981f, 18.254f, 16.673f, 17.559f, 16.4f)
            curveTo(16.896f, 16.139f, 16.101f, 15.921f, 15.209f, 15.766f)
            lineTo(16.478f, 14.497f)
            curveTo(17.067f, 14.639f, 17.615f, 14.809f, 18.108f, 15.004f)
            curveTo(18.907f, 15.318f, 19.603f, 15.711f, 20.113f, 16.186f)
            curveTo(20.624f, 16.662f, 21f, 17.274f, 21f, 18f)
            curveTo(21f, 18.726f, 20.624f, 19.338f, 20.113f, 19.814f)
            curveTo(19.603f, 20.288f, 18.907f, 20.681f, 18.108f, 20.996f)
            curveTo(16.508f, 21.626f, 14.348f, 22f, 12f, 22f)
            curveTo(9.652f, 22f, 7.492f, 21.626f, 5.891f, 20.996f)
            curveTo(5.093f, 20.681f, 4.397f, 20.288f, 3.887f, 19.814f)
            curveTo(3.376f, 19.338f, 3f, 18.726f, 3f, 18f)
            curveTo(3f, 17.274f, 3.376f, 16.662f, 3.887f, 16.186f)
            curveTo(4.397f, 15.711f, 5.093f, 15.318f, 5.891f, 15.004f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PlantCattailPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PlantCattail, contentDescription = null)
    }
}
