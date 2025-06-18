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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Filled.BracesVariable: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BracesVariable",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6f)
            curveTo(3f, 4.343f, 4.343f, 3f, 6f, 3f)
            curveTo(6.552f, 3f, 7f, 3.448f, 7f, 4f)
            curveTo(7f, 4.552f, 6.552f, 5f, 6f, 5f)
            curveTo(5.448f, 5f, 5f, 5.448f, 5f, 6f)
            verticalLineTo(9.938f)
            curveTo(5f, 10.727f, 4.693f, 11.457f, 4.18f, 12f)
            curveTo(4.693f, 12.543f, 5f, 13.273f, 5f, 14.062f)
            verticalLineTo(18f)
            curveTo(5f, 18.552f, 5.448f, 19f, 6f, 19f)
            curveTo(6.552f, 19f, 7f, 19.448f, 7f, 20f)
            curveTo(7f, 20.552f, 6.552f, 21f, 6f, 21f)
            curveTo(4.343f, 21f, 3f, 19.657f, 3f, 18f)
            verticalLineTo(14.062f)
            curveTo(3f, 13.603f, 2.688f, 13.203f, 2.243f, 13.091f)
            lineTo(1.757f, 12.97f)
            curveTo(1.312f, 12.859f, 1f, 12.459f, 1f, 12f)
            curveTo(1f, 11.541f, 1.312f, 11.141f, 1.757f, 11.03f)
            lineTo(2.243f, 10.909f)
            curveTo(2.688f, 10.797f, 3f, 10.397f, 3f, 9.938f)
            verticalLineTo(6f)
            close()
            moveTo(21f, 6f)
            curveTo(21f, 4.343f, 19.657f, 3f, 18f, 3f)
            curveTo(17.448f, 3f, 17f, 3.448f, 17f, 4f)
            curveTo(17f, 4.552f, 17.448f, 5f, 18f, 5f)
            curveTo(18.552f, 5f, 19f, 5.448f, 19f, 6f)
            verticalLineTo(9.938f)
            curveTo(19f, 10.727f, 19.307f, 11.457f, 19.82f, 12f)
            curveTo(19.307f, 12.543f, 19f, 13.273f, 19f, 14.062f)
            verticalLineTo(18f)
            curveTo(19f, 18.552f, 18.552f, 19f, 18f, 19f)
            curveTo(17.448f, 19f, 17f, 19.448f, 17f, 20f)
            curveTo(17f, 20.552f, 17.448f, 21f, 18f, 21f)
            curveTo(19.657f, 21f, 21f, 19.657f, 21f, 18f)
            verticalLineTo(14.062f)
            curveTo(21f, 13.603f, 21.312f, 13.203f, 21.757f, 13.091f)
            lineTo(22.243f, 12.97f)
            curveTo(22.688f, 12.859f, 23f, 12.459f, 23f, 12f)
            curveTo(23f, 11.541f, 22.688f, 11.141f, 22.243f, 11.03f)
            lineTo(21.757f, 10.909f)
            curveTo(21.312f, 10.797f, 21f, 10.397f, 21f, 9.938f)
            verticalLineTo(6f)
            close()
            moveTo(9.289f, 6.886f)
            curveTo(8.95f, 6.45f, 8.322f, 6.372f, 7.886f, 6.711f)
            curveTo(7.45f, 7.05f, 7.372f, 7.678f, 7.711f, 8.114f)
            lineTo(10.733f, 12f)
            lineTo(7.711f, 15.886f)
            curveTo(7.372f, 16.322f, 7.45f, 16.95f, 7.886f, 17.289f)
            curveTo(8.322f, 17.628f, 8.95f, 17.55f, 9.289f, 17.114f)
            lineTo(12f, 13.629f)
            lineTo(14.711f, 17.114f)
            curveTo(15.05f, 17.55f, 15.678f, 17.628f, 16.114f, 17.289f)
            curveTo(16.55f, 16.95f, 16.628f, 16.322f, 16.289f, 15.886f)
            lineTo(13.267f, 12f)
            lineTo(16.289f, 8.114f)
            curveTo(16.628f, 7.678f, 16.55f, 7.05f, 16.114f, 6.711f)
            curveTo(15.678f, 6.372f, 15.05f, 6.45f, 14.711f, 6.886f)
            lineTo(12f, 10.371f)
            lineTo(9.289f, 6.886f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BracesVariablePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BracesVariable, contentDescription = null)
    }
}
