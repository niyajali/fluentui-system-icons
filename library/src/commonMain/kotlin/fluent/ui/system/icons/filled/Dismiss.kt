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

public val FluentUi.Filled.Dismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Dismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4.21f, 4.387f)
            lineTo(4.293f, 4.293f)
            curveTo(4.653f, 3.932f, 5.221f, 3.905f, 5.613f, 4.21f)
            lineTo(5.707f, 4.293f)
            lineTo(12f, 10.585f)
            lineTo(18.293f, 4.293f)
            curveTo(18.683f, 3.902f, 19.317f, 3.902f, 19.707f, 4.293f)
            curveTo(20.098f, 4.683f, 20.098f, 5.317f, 19.707f, 5.707f)
            lineTo(13.415f, 12f)
            lineTo(19.707f, 18.293f)
            curveTo(20.068f, 18.653f, 20.095f, 19.221f, 19.79f, 19.613f)
            lineTo(19.707f, 19.707f)
            curveTo(19.347f, 20.068f, 18.779f, 20.095f, 18.387f, 19.79f)
            lineTo(18.293f, 19.707f)
            lineTo(12f, 13.415f)
            lineTo(5.707f, 19.707f)
            curveTo(5.317f, 20.098f, 4.683f, 20.098f, 4.293f, 19.707f)
            curveTo(3.902f, 19.317f, 3.902f, 18.683f, 4.293f, 18.293f)
            lineTo(10.585f, 12f)
            lineTo(4.293f, 5.707f)
            curveTo(3.932f, 5.347f, 3.905f, 4.779f, 4.21f, 4.387f)
            lineTo(4.293f, 4.293f)
            lineTo(4.21f, 4.387f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.Dismiss, contentDescription = null)
    }
}
