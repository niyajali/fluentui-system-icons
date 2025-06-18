/**
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

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.WindowNew: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WindowNew",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(19f, 17.975f)
            verticalLineTo(17.839f)
            curveTo(20.174f, 17.349f, 21f, 16.19f, 21f, 14.838f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(9.25f)
            curveTo(7.804f, 3f, 6.579f, 3.944f, 6.157f, 5.25f)
            horizontalLineTo(5.956f)
            curveTo(5.044f, 5.25f, 4.268f, 5.571f, 3.734f, 6.204f)
            curveTo(3.216f, 6.817f, 3f, 7.635f, 3f, 8.5f)
            verticalLineTo(17.25f)
            curveTo(3f, 18.31f, 3.383f, 19.264f, 4.111f, 19.95f)
            curveTo(4.836f, 20.633f, 5.843f, 20.995f, 7f, 20.995f)
            lineTo(10.919f, 20.995f)
            lineTo(14.996f, 21f)
            lineTo(14.998f, 21f)
            curveTo(15.974f, 21.004f, 16.941f, 20.799f, 17.691f, 20.319f)
            curveTo(18.471f, 19.82f, 19f, 19.025f, 19f, 17.975f)
            close()
            moveTo(5.956f, 6.75f)
            horizontalLineTo(6f)
            verticalLineTo(14.838f)
            curveTo(6f, 16.633f, 7.455f, 18.088f, 9.25f, 18.088f)
            horizontalLineTo(17.496f)
            curveTo(17.464f, 18.506f, 17.254f, 18.818f, 16.882f, 19.056f)
            curveTo(16.449f, 19.334f, 15.792f, 19.504f, 15.004f, 19.5f)
            lineTo(15.001f, 19.5f)
            lineTo(10.919f, 19.495f)
            lineTo(7f, 19.495f)
            curveTo(6.157f, 19.495f, 5.539f, 19.235f, 5.139f, 18.858f)
            curveTo(4.742f, 18.484f, 4.5f, 17.94f, 4.5f, 17.25f)
            verticalLineTo(8.5f)
            curveTo(4.5f, 7.865f, 4.659f, 7.433f, 4.88f, 7.171f)
            curveTo(5.085f, 6.929f, 5.412f, 6.75f, 5.956f, 6.75f)
            close()
            moveTo(12.022f, 6.5f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 6.5f, 17.5f, 6.836f, 17.5f, 7.25f)
            verticalLineTo(11.979f)
            curveTo(17.5f, 12.393f, 17.164f, 12.729f, 16.75f, 12.729f)
            curveTo(16.336f, 12.729f, 16f, 12.393f, 16f, 11.979f)
            verticalLineTo(9.061f)
            lineTo(10.78f, 14.28f)
            curveTo(10.487f, 14.573f, 10.013f, 14.573f, 9.72f, 14.28f)
            curveTo(9.427f, 13.987f, 9.427f, 13.513f, 9.72f, 13.22f)
            lineTo(14.939f, 8f)
            horizontalLineTo(12.022f)
            curveTo(11.607f, 8f, 11.272f, 7.664f, 11.272f, 7.25f)
            curveTo(11.272f, 6.836f, 11.607f, 6.5f, 12.022f, 6.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WindowNewPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WindowNew, contentDescription = null)
    }
}
