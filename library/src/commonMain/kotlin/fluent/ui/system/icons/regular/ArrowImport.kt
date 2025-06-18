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
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Regular.ArrowImport: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowImport",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21.25f, 4.5f)
            curveTo(21.629f, 4.5f, 21.943f, 4.782f, 21.993f, 5.148f)
            lineTo(22f, 5.25f)
            verticalLineTo(18.254f)
            curveTo(22f, 18.668f, 21.664f, 19.004f, 21.25f, 19.004f)
            curveTo(20.87f, 19.004f, 20.556f, 18.722f, 20.507f, 18.356f)
            lineTo(20.5f, 18.254f)
            verticalLineTo(5.25f)
            curveTo(20.5f, 4.836f, 20.836f, 4.5f, 21.25f, 4.5f)
            close()
            moveTo(12.647f, 6.304f)
            lineTo(12.719f, 6.22f)
            curveTo(12.986f, 5.953f, 13.403f, 5.929f, 13.696f, 6.147f)
            lineTo(13.78f, 6.22f)
            lineTo(18.777f, 11.217f)
            curveTo(19.043f, 11.483f, 19.067f, 11.9f, 18.85f, 12.193f)
            lineTo(18.777f, 12.278f)
            lineTo(13.781f, 17.281f)
            curveTo(13.488f, 17.574f, 13.013f, 17.574f, 12.72f, 17.282f)
            curveTo(12.453f, 17.016f, 12.429f, 16.599f, 12.646f, 16.305f)
            lineTo(12.719f, 16.221f)
            lineTo(16.43f, 12.504f)
            lineTo(2.75f, 12.505f)
            curveTo(2.37f, 12.505f, 2.057f, 12.223f, 2.007f, 11.857f)
            lineTo(2f, 11.755f)
            curveTo(2f, 11.375f, 2.282f, 11.061f, 2.648f, 11.012f)
            lineTo(2.75f, 11.005f)
            lineTo(16.443f, 11.004f)
            lineTo(12.719f, 7.28f)
            curveTo(12.453f, 7.014f, 12.429f, 6.597f, 12.647f, 6.304f)
            lineTo(12.719f, 6.22f)
            lineTo(12.647f, 6.304f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowImportPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowImport, contentDescription = null)
    }
}
