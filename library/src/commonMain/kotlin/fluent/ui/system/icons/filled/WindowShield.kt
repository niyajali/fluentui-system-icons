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

public val FluentUi.Filled.WindowShield: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.WindowShield",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(11.976f)
            curveTo(20.433f, 11.798f, 19.92f, 11.496f, 19.5f, 11.185f)
            verticalLineTo(8.5f)
            horizontalLineTo(4.5f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(12.732f)
            curveTo(13.023f, 20.04f, 13.398f, 20.542f, 13.854f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(17.99f, 11.194f)
            curveTo(18.642f, 11.845f, 19.896f, 12.88f, 21.439f, 13.093f)
            curveTo(21.747f, 13.135f, 22f, 13.378f, 22f, 13.682f)
            verticalLineTo(16.52f)
            curveTo(22f, 20.336f, 18.421f, 21.721f, 17.647f, 21.976f)
            curveTo(17.55f, 22.008f, 17.451f, 22.008f, 17.354f, 21.976f)
            curveTo(16.58f, 21.721f, 13f, 20.336f, 13f, 16.52f)
            lineTo(13f, 13.682f)
            curveTo(13f, 13.378f, 13.253f, 13.135f, 13.561f, 13.093f)
            curveTo(15.103f, 12.88f, 16.358f, 11.845f, 17.01f, 11.194f)
            curveTo(17.27f, 10.935f, 17.729f, 10.935f, 17.99f, 11.194f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun WindowShieldPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.WindowShield, contentDescription = null)
    }
}
