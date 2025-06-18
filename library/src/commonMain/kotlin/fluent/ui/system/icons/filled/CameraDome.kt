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

public val FluentUi.Filled.CameraDome: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CameraDome",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(2f, 3.75f)
            curveTo(2f, 2.783f, 2.783f, 2f, 3.75f, 2f)
            horizontalLineTo(20.25f)
            curveTo(21.216f, 2f, 22f, 2.783f, 22f, 3.75f)
            curveTo(22f, 4.716f, 21.216f, 5.5f, 20.25f, 5.5f)
            horizontalLineTo(3.75f)
            curveTo(2.783f, 5.5f, 2f, 4.716f, 2f, 3.75f)
            close()
            moveTo(12f, 17.5f)
            curveTo(14.209f, 17.5f, 16f, 15.709f, 16f, 13.5f)
            curveTo(16f, 11.291f, 14.209f, 9.5f, 12f, 9.5f)
            curveTo(9.791f, 9.5f, 8f, 11.291f, 8f, 13.5f)
            curveTo(8f, 15.709f, 9.791f, 17.5f, 12f, 17.5f)
            close()
            moveTo(14.5f, 13.5f)
            curveTo(14.5f, 14.881f, 13.381f, 16f, 12f, 16f)
            curveTo(10.619f, 16f, 9.5f, 14.881f, 9.5f, 13.5f)
            curveTo(9.5f, 12.119f, 10.619f, 11f, 12f, 11f)
            curveTo(13.381f, 11f, 14.5f, 12.119f, 14.5f, 13.5f)
            close()
            moveTo(3f, 7f)
            horizontalLineTo(21f)
            verticalLineTo(13f)
            curveTo(21f, 17.971f, 16.971f, 22f, 12f, 22f)
            curveTo(7.029f, 22f, 3f, 17.971f, 3f, 13f)
            verticalLineTo(7f)
            close()
            moveTo(12f, 19f)
            curveTo(15.038f, 19f, 17.5f, 16.538f, 17.5f, 13.5f)
            curveTo(17.5f, 10.462f, 15.038f, 8f, 12f, 8f)
            curveTo(8.962f, 8f, 6.5f, 10.462f, 6.5f, 13.5f)
            curveTo(6.5f, 16.538f, 8.962f, 19f, 12f, 19f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CameraDomePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CameraDome, contentDescription = null)
    }
}
