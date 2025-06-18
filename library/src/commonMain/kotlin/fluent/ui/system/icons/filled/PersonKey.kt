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

public val FluentUi.Filled.PersonKey: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonKey",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(15f, 15.5f)
            curveTo(15f, 14.974f, 15.09f, 14.469f, 15.256f, 14f)
            horizontalLineTo(6.253f)
            curveTo(5.011f, 14f, 4.004f, 15.007f, 4.004f, 16.249f)
            verticalLineTo(17.169f)
            curveTo(4.004f, 17.741f, 4.182f, 18.298f, 4.514f, 18.764f)
            curveTo(5.902f, 20.712f, 8.084f, 21.775f, 11f, 21.969f)
            verticalLineTo(20.914f)
            curveTo(11f, 20.384f, 11.211f, 19.875f, 11.586f, 19.5f)
            lineTo(15.034f, 16.052f)
            curveTo(15.012f, 15.871f, 15f, 15.687f, 15f, 15.5f)
            close()
            moveTo(12f, 2.004f)
            curveTo(14.762f, 2.004f, 17f, 4.243f, 17f, 7.004f)
            curveTo(17f, 9.766f, 14.762f, 12.004f, 12f, 12.004f)
            curveTo(9.239f, 12.004f, 7f, 9.766f, 7f, 7.004f)
            curveTo(7f, 4.243f, 9.239f, 2.004f, 12f, 2.004f)
            close()
            moveTo(19.5f, 19f)
            curveTo(21.433f, 19f, 23f, 17.433f, 23f, 15.5f)
            curveTo(23f, 13.567f, 21.433f, 12f, 19.5f, 12f)
            curveTo(17.567f, 12f, 16f, 13.567f, 16f, 15.5f)
            curveTo(16f, 15.806f, 16.04f, 16.104f, 16.114f, 16.387f)
            lineTo(12.293f, 20.207f)
            curveTo(12.106f, 20.395f, 12f, 20.649f, 12f, 20.914f)
            verticalLineTo(22.5f)
            curveTo(12f, 22.776f, 12.224f, 23f, 12.5f, 23f)
            horizontalLineTo(14.5f)
            curveTo(14.776f, 23f, 15f, 22.776f, 15f, 22.5f)
            verticalLineTo(22f)
            horizontalLineTo(16f)
            curveTo(16.276f, 22f, 16.5f, 21.776f, 16.5f, 21.5f)
            verticalLineTo(20.5f)
            horizontalLineTo(17.5f)
            curveTo(17.776f, 20.5f, 18f, 20.276f, 18f, 20f)
            verticalLineTo(19f)
            horizontalLineTo(19.5f)
            close()
            moveTo(20f, 14f)
            curveTo(20.552f, 14f, 21f, 14.448f, 21f, 15f)
            curveTo(21f, 15.552f, 20.552f, 16f, 20f, 16f)
            curveTo(19.448f, 16f, 19f, 15.552f, 19f, 15f)
            curveTo(19f, 14.448f, 19.448f, 14f, 20f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PersonKeyPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.PersonKey, contentDescription = null)
    }
}
