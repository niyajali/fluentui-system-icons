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
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.Patch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Patch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 12.75f)
            curveTo(12.414f, 12.75f, 12.75f, 12.414f, 12.75f, 12f)
            curveTo(12.75f, 11.585f, 12.414f, 11.25f, 12f, 11.25f)
            curveTo(11.585f, 11.25f, 11.25f, 11.585f, 11.25f, 12f)
            curveTo(11.25f, 12.414f, 11.585f, 12.75f, 12f, 12.75f)
            close()
            moveTo(10.25f, 12f)
            curveTo(10.25f, 12.414f, 9.914f, 12.75f, 9.5f, 12.75f)
            curveTo(9.086f, 12.75f, 8.75f, 12.414f, 8.75f, 12f)
            curveTo(8.75f, 11.585f, 9.086f, 11.25f, 9.5f, 11.25f)
            curveTo(9.914f, 11.25f, 10.25f, 11.585f, 10.25f, 12f)
            close()
            moveTo(14.5f, 12.75f)
            curveTo(14.914f, 12.75f, 15.25f, 12.414f, 15.25f, 12f)
            curveTo(15.25f, 11.585f, 14.914f, 11.25f, 14.5f, 11.25f)
            curveTo(14.085f, 11.25f, 13.75f, 11.585f, 13.75f, 12f)
            curveTo(13.75f, 12.414f, 14.085f, 12.75f, 14.5f, 12.75f)
            close()
            moveTo(12.75f, 14.5f)
            curveTo(12.75f, 14.914f, 12.414f, 15.25f, 12f, 15.25f)
            curveTo(11.585f, 15.25f, 11.25f, 14.914f, 11.25f, 14.5f)
            curveTo(11.25f, 14.085f, 11.585f, 13.75f, 12f, 13.75f)
            curveTo(12.414f, 13.75f, 12.75f, 14.085f, 12.75f, 14.5f)
            close()
            moveTo(12f, 10.25f)
            curveTo(12.414f, 10.25f, 12.75f, 9.914f, 12.75f, 9.5f)
            curveTo(12.75f, 9.085f, 12.414f, 8.75f, 12f, 8.75f)
            curveTo(11.585f, 8.75f, 11.25f, 9.085f, 11.25f, 9.5f)
            curveTo(11.25f, 9.914f, 11.585f, 10.25f, 12f, 10.25f)
            close()
            moveTo(3.237f, 18.298f)
            curveTo(1.968f, 17.028f, 1.968f, 14.971f, 3.237f, 13.701f)
            lineTo(13.702f, 3.237f)
            curveTo(14.971f, 1.968f, 17.029f, 1.968f, 18.298f, 3.237f)
            lineTo(20.762f, 5.702f)
            curveTo(22.032f, 6.971f, 22.032f, 9.029f, 20.762f, 10.298f)
            lineTo(10.298f, 20.762f)
            curveTo(9.029f, 22.031f, 6.971f, 22.031f, 5.702f, 20.762f)
            lineTo(3.237f, 18.298f)
            close()
            moveTo(4.298f, 14.762f)
            curveTo(3.615f, 15.446f, 3.615f, 16.554f, 4.298f, 17.237f)
            lineTo(6.762f, 19.701f)
            curveTo(7.446f, 20.385f, 8.554f, 20.385f, 9.237f, 19.701f)
            lineTo(10.939f, 18f)
            lineTo(6f, 13.061f)
            lineTo(4.298f, 14.762f)
            close()
            moveTo(16.939f, 12f)
            lineTo(12f, 7.06f)
            lineTo(7.06f, 12f)
            lineTo(12f, 16.939f)
            lineTo(16.939f, 12f)
            close()
            moveTo(18f, 10.939f)
            lineTo(19.702f, 9.237f)
            curveTo(20.385f, 8.554f, 20.385f, 7.446f, 19.702f, 6.762f)
            lineTo(17.237f, 4.298f)
            curveTo(16.554f, 3.614f, 15.446f, 3.614f, 14.762f, 4.298f)
            lineTo(13.06f, 6f)
            lineTo(18f, 10.939f)
            close()
            moveTo(10.232f, 5.293f)
            lineTo(9.237f, 4.298f)
            curveTo(8.554f, 3.614f, 7.446f, 3.614f, 6.762f, 4.298f)
            lineTo(4.298f, 6.762f)
            curveTo(3.614f, 7.446f, 3.614f, 8.554f, 4.298f, 9.237f)
            lineTo(5.293f, 10.232f)
            lineTo(4.232f, 11.293f)
            lineTo(3.237f, 10.298f)
            curveTo(1.968f, 9.029f, 1.968f, 6.971f, 3.237f, 5.702f)
            lineTo(5.702f, 3.237f)
            curveTo(6.971f, 1.968f, 9.029f, 1.968f, 10.298f, 3.237f)
            lineTo(11.293f, 4.232f)
            lineTo(10.232f, 5.293f)
            close()
            moveTo(12.707f, 19.768f)
            lineTo(13.701f, 20.762f)
            curveTo(14.971f, 22.031f, 17.028f, 22.031f, 18.298f, 20.762f)
            lineTo(20.762f, 18.298f)
            curveTo(22.031f, 17.029f, 22.031f, 14.971f, 20.762f, 13.702f)
            lineTo(19.767f, 12.707f)
            lineTo(18.707f, 13.768f)
            lineTo(19.701f, 14.762f)
            curveTo(20.385f, 15.446f, 20.385f, 16.554f, 19.701f, 17.237f)
            lineTo(17.237f, 19.702f)
            curveTo(16.554f, 20.385f, 15.446f, 20.385f, 14.762f, 19.702f)
            lineTo(13.767f, 18.707f)
            lineTo(12.707f, 19.768f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PatchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.Patch, contentDescription = null)
    }
}
