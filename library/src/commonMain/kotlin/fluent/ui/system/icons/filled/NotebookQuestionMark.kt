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

public val FluentUi.Filled.NotebookQuestionMark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.NotebookQuestionMark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            close()
            moveTo(16.749f, 2f)
            curveTo(17.992f, 2f, 18.999f, 3.007f, 18.999f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(18.999f, 20.993f, 17.992f, 22f, 16.749f, 22f)
            lineTo(11.19f, 22.001f)
            curveTo(12.311f, 20.833f, 13f, 19.247f, 13f, 17.5f)
            curveTo(13f, 13.91f, 10.09f, 11f, 6.5f, 11f)
            curveTo(5.614f, 11f, 4.77f, 11.177f, 4f, 11.498f)
            verticalLineTo(4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(16.749f)
            close()
            moveTo(6.5f, 19.88f)
            curveTo(6.155f, 19.88f, 5.875f, 20.16f, 5.875f, 20.504f)
            curveTo(5.875f, 20.849f, 6.155f, 21.129f, 6.5f, 21.129f)
            curveTo(6.845f, 21.129f, 7.125f, 20.849f, 7.125f, 20.504f)
            curveTo(7.125f, 20.16f, 6.845f, 19.88f, 6.5f, 19.88f)
            close()
            moveTo(6.5f, 14.003f)
            curveTo(5.452f, 14.003f, 4.636f, 14.821f, 4.647f, 15.957f)
            curveTo(4.649f, 16.233f, 4.875f, 16.455f, 5.151f, 16.453f)
            curveTo(5.428f, 16.45f, 5.649f, 16.224f, 5.647f, 15.948f)
            curveTo(5.641f, 15.369f, 6.006f, 15.003f, 6.5f, 15.003f)
            curveTo(6.972f, 15.003f, 7.353f, 15.395f, 7.353f, 15.953f)
            curveTo(7.353f, 16.177f, 7.278f, 16.344f, 7.036f, 16.63f)
            lineTo(6.937f, 16.743f)
            lineTo(6.671f, 17.033f)
            curveTo(6.187f, 17.575f, 6f, 17.926f, 6f, 18.501f)
            curveTo(6f, 18.777f, 6.224f, 19.001f, 6.5f, 19.001f)
            curveTo(6.776f, 19.001f, 7f, 18.777f, 7f, 18.501f)
            curveTo(7f, 18.268f, 7.076f, 18.098f, 7.324f, 17.806f)
            lineTo(7.425f, 17.691f)
            lineTo(7.69f, 17.4f)
            curveTo(8.168f, 16.866f, 8.353f, 16.519f, 8.353f, 15.953f)
            curveTo(8.353f, 14.849f, 7.531f, 14.003f, 6.5f, 14.003f)
            close()
            moveTo(20.75f, 15.002f)
            curveTo(21.13f, 15.002f, 21.444f, 15.284f, 21.493f, 15.65f)
            lineTo(21.5f, 15.752f)
            verticalLineTo(17.25f)
            curveTo(21.5f, 17.63f, 21.218f, 17.944f, 20.852f, 17.993f)
            lineTo(20.75f, 18f)
            horizontalLineTo(20f)
            verticalLineTo(15.002f)
            horizontalLineTo(20.75f)
            close()
            moveTo(20.75f, 11.002f)
            curveTo(21.13f, 11.002f, 21.444f, 11.284f, 21.493f, 11.65f)
            lineTo(21.5f, 11.752f)
            verticalLineTo(13.25f)
            curveTo(21.5f, 13.63f, 21.218f, 13.943f, 20.852f, 13.993f)
            lineTo(20.75f, 14f)
            horizontalLineTo(20f)
            verticalLineTo(11.002f)
            horizontalLineTo(20.75f)
            close()
            moveTo(20.75f, 7.002f)
            curveTo(21.13f, 7.002f, 21.444f, 7.284f, 21.493f, 7.65f)
            lineTo(21.5f, 7.752f)
            verticalLineTo(9.25f)
            curveTo(21.5f, 9.63f, 21.218f, 9.943f, 20.852f, 9.993f)
            lineTo(20.75f, 10f)
            horizontalLineTo(20f)
            verticalLineTo(7.002f)
            horizontalLineTo(20.75f)
            close()
            moveTo(14.748f, 5.497f)
            horizontalLineTo(8.252f)
            curveTo(7.873f, 5.497f, 7.559f, 5.779f, 7.509f, 6.145f)
            lineTo(7.502f, 6.247f)
            verticalLineTo(7.751f)
            curveTo(7.502f, 8.131f, 7.785f, 8.444f, 8.151f, 8.494f)
            lineTo(8.252f, 8.501f)
            horizontalLineTo(14.748f)
            curveTo(15.127f, 8.501f, 15.441f, 8.219f, 15.491f, 7.853f)
            lineTo(15.498f, 7.751f)
            verticalLineTo(6.247f)
            curveTo(15.498f, 5.833f, 15.162f, 5.497f, 14.748f, 5.497f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NotebookQuestionMarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.NotebookQuestionMark, contentDescription = null)
    }
}
