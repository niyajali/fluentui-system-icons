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

public val FluentIcons.Regular.ImageSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ImageSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(10.757f)
            curveTo(3.446f, 10.389f, 3.952f, 10.089f, 4.5f, 9.875f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(19.5f, 17.959f, 19.463f, 18.159f, 19.396f, 18.345f)
            lineTo(13.574f, 12.643f)
            lineTo(13.446f, 12.527f)
            curveTo(12.809f, 11.992f, 11.946f, 11.865f, 11.203f, 12.146f)
            curveTo(11.462f, 12.572f, 11.664f, 13.036f, 11.801f, 13.528f)
            curveTo(12.05f, 13.459f, 12.327f, 13.521f, 12.525f, 13.715f)
            lineTo(18.33f, 19.401f)
            curveTo(18.149f, 19.465f, 17.954f, 19.5f, 17.75f, 19.5f)
            horizontalLineTo(12.975f)
            lineTo(13.487f, 20.013f)
            curveTo(13.765f, 20.291f, 13.93f, 20.639f, 13.982f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(17.504f, 8.752f)
            curveTo(17.504f, 7.508f, 16.496f, 6.5f, 15.252f, 6.5f)
            curveTo(14.008f, 6.5f, 13f, 7.508f, 13f, 8.752f)
            curveTo(13f, 9.996f, 14.008f, 11.004f, 15.252f, 11.004f)
            curveTo(16.496f, 11.004f, 17.504f, 9.996f, 17.504f, 8.752f)
            close()
            moveTo(14.5f, 8.752f)
            curveTo(14.5f, 8.337f, 14.837f, 8f, 15.252f, 8f)
            curveTo(15.667f, 8f, 16.004f, 8.337f, 16.004f, 8.752f)
            curveTo(16.004f, 9.167f, 15.667f, 9.504f, 15.252f, 9.504f)
            curveTo(14.837f, 9.504f, 14.5f, 9.167f, 14.5f, 8.752f)
            close()
            moveTo(9.95f, 17.889f)
            curveTo(10.605f, 17.108f, 11f, 16.1f, 11f, 15f)
            curveTo(11f, 12.515f, 8.985f, 10.5f, 6.5f, 10.5f)
            curveTo(4.015f, 10.5f, 2f, 12.515f, 2f, 15f)
            curveTo(2f, 17.485f, 4.015f, 19.5f, 6.5f, 19.5f)
            curveTo(7.342f, 19.5f, 8.131f, 19.268f, 8.805f, 18.866f)
            lineTo(11.72f, 21.78f)
            curveTo(12.013f, 22.073f, 12.487f, 22.073f, 12.78f, 21.78f)
            curveTo(13.073f, 21.487f, 13.073f, 21.013f, 12.78f, 20.72f)
            lineTo(9.95f, 17.889f)
            close()
            moveTo(6.5f, 18f)
            curveTo(4.843f, 18f, 3.5f, 16.657f, 3.5f, 15f)
            curveTo(3.5f, 13.343f, 4.843f, 12f, 6.5f, 12f)
            curveTo(8.157f, 12f, 9.5f, 13.343f, 9.5f, 15f)
            curveTo(9.5f, 16.657f, 8.157f, 18f, 6.5f, 18f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ImageSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ImageSearch, contentDescription = null)
    }
}
