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

public val FluentUi.Regular.FlagClock: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.FlagClock",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.75f, 2.998f)
            curveTo(3.336f, 2.998f, 3f, 3.334f, 3f, 3.748f)
            verticalLineTo(21.25f)
            lineTo(3.007f, 21.352f)
            curveTo(3.057f, 21.718f, 3.37f, 22f, 3.75f, 22f)
            lineTo(3.852f, 21.993f)
            curveTo(4.218f, 21.943f, 4.5f, 21.63f, 4.5f, 21.25f)
            verticalLineTo(16.5f)
            lineTo(11.076f, 16.5f)
            curveTo(11.157f, 15.977f, 11.3f, 15.475f, 11.498f, 15f)
            horizontalLineTo(4.5f)
            verticalLineTo(4.498f)
            horizontalLineTo(18.754f)
            lineTo(15.152f, 9.299f)
            curveTo(14.952f, 9.566f, 14.952f, 9.933f, 15.152f, 10.199f)
            lineTo(15.901f, 11.198f)
            curveTo(16.413f, 11.069f, 16.948f, 11f, 17.5f, 11f)
            curveTo(17.543f, 11f, 17.586f, 11f, 17.629f, 11.001f)
            lineTo(16.69f, 9.749f)
            lineTo(20.854f, 4.198f)
            curveTo(21.225f, 3.704f, 20.872f, 2.998f, 20.254f, 2.998f)
            horizontalLineTo(3.75f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(17.5f, 14f)
            curveTo(17.776f, 14f, 18f, 14.224f, 18f, 14.5f)
            verticalLineTo(17f)
            horizontalLineTo(20f)
            curveTo(20.276f, 17f, 20.5f, 17.224f, 20.5f, 17.5f)
            curveTo(20.5f, 17.776f, 20.276f, 18f, 20f, 18f)
            horizontalLineTo(17.5f)
            curveTo(17.224f, 18f, 17f, 17.776f, 17f, 17.5f)
            verticalLineTo(14.5f)
            curveTo(17f, 14.224f, 17.224f, 14f, 17.5f, 14f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun FlagClockPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.FlagClock, contentDescription = null)
    }
}
