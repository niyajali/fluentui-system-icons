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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.ImageSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ImageSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.504f, 8.252f)
            curveTo(16.504f, 7.837f, 16.167f, 7.5f, 15.752f, 7.5f)
            curveTo(15.337f, 7.5f, 15f, 7.837f, 15f, 8.252f)
            curveTo(15f, 8.667f, 15.337f, 9.004f, 15.752f, 9.004f)
            curveTo(16.167f, 9.004f, 16.504f, 8.667f, 16.504f, 8.252f)
            close()
            moveTo(3f, 10.757f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(21f, 18.377f, 20.822f, 18.963f, 20.515f, 19.459f)
            lineTo(13.576f, 12.648f)
            lineTo(13.448f, 12.531f)
            curveTo(12.811f, 11.995f, 11.948f, 11.867f, 11.204f, 12.148f)
            curveTo(10.239f, 10.561f, 8.493f, 9.5f, 6.5f, 9.5f)
            curveTo(5.17f, 9.5f, 3.951f, 9.972f, 3f, 10.757f)
            close()
            moveTo(13.5f, 8.252f)
            curveTo(13.5f, 9.496f, 14.508f, 10.504f, 15.752f, 10.504f)
            curveTo(16.996f, 10.504f, 18.004f, 9.496f, 18.004f, 8.252f)
            curveTo(18.004f, 7.008f, 16.996f, 6f, 15.752f, 6f)
            curveTo(14.508f, 6f, 13.5f, 7.008f, 13.5f, 8.252f)
            close()
            moveTo(13.982f, 21f)
            curveTo(13.93f, 20.639f, 13.765f, 20.291f, 13.487f, 20.013f)
            lineTo(11.25f, 17.775f)
            curveTo(11.726f, 16.96f, 12f, 16.011f, 12f, 15f)
            curveTo(12f, 14.491f, 11.931f, 13.998f, 11.801f, 13.53f)
            curveTo(12.013f, 13.472f, 12.246f, 13.509f, 12.432f, 13.64f)
            lineTo(12.525f, 13.718f)
            lineTo(19.453f, 20.519f)
            curveTo(18.958f, 20.824f, 18.375f, 21f, 17.75f, 21f)
            horizontalLineTo(13.982f)
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
        Image(imageVector = FluentUi.Filled.ImageSearch, contentDescription = null)
    }
}
