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

public val FluentUi.Regular.ShieldProhibited: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ShieldProhibited",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3.75f, 5f)
            curveTo(3.336f, 5f, 3f, 5.336f, 3f, 5.75f)
            verticalLineTo(11f)
            curveTo(3f, 16.001f, 5.958f, 19.676f, 11.725f, 21.948f)
            curveTo(11.902f, 22.017f, 12.098f, 22.017f, 12.275f, 21.948f)
            curveTo(12.419f, 21.891f, 12.561f, 21.833f, 12.701f, 21.775f)
            curveTo(12.042f, 21.3f, 11.476f, 20.704f, 11.034f, 20.019f)
            curveTo(6.64f, 17.962f, 4.5f, 14.975f, 4.5f, 11f)
            verticalLineTo(6.478f)
            curveTo(7.077f, 6.326f, 9.581f, 5.388f, 12f, 3.678f)
            curveTo(14.419f, 5.388f, 16.923f, 6.326f, 19.5f, 6.478f)
            verticalLineTo(10.732f)
            curveTo(20.041f, 11.014f, 20.537f, 11.37f, 20.975f, 11.786f)
            curveTo(20.992f, 11.528f, 21f, 11.266f, 21f, 11f)
            verticalLineTo(5.75f)
            curveTo(21f, 5.336f, 20.664f, 5f, 20.25f, 5f)
            curveTo(17.587f, 5f, 14.992f, 4.057f, 12.45f, 2.15f)
            curveTo(12.183f, 1.95f, 11.817f, 1.95f, 11.55f, 2.15f)
            curveTo(9.008f, 4.057f, 6.413f, 5f, 3.75f, 5f)
            close()
            moveTo(16.5f, 22f)
            curveTo(19.538f, 22f, 22f, 19.538f, 22f, 16.5f)
            curveTo(22f, 13.462f, 19.538f, 11f, 16.5f, 11f)
            curveTo(13.462f, 11f, 11f, 13.462f, 11f, 16.5f)
            curveTo(11f, 19.538f, 13.462f, 22f, 16.5f, 22f)
            close()
            moveTo(13.191f, 18.748f)
            curveTo(12.755f, 18.108f, 12.5f, 17.333f, 12.5f, 16.5f)
            curveTo(12.5f, 14.291f, 14.291f, 12.5f, 16.5f, 12.5f)
            curveTo(17.333f, 12.5f, 18.108f, 12.755f, 18.748f, 13.191f)
            lineTo(13.191f, 18.748f)
            close()
            moveTo(14.252f, 19.809f)
            lineTo(19.809f, 14.252f)
            curveTo(20.245f, 14.892f, 20.5f, 15.667f, 20.5f, 16.5f)
            curveTo(20.5f, 18.709f, 18.709f, 20.5f, 16.5f, 20.5f)
            curveTo(15.667f, 20.5f, 14.892f, 20.245f, 14.252f, 19.809f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShieldProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ShieldProhibited, contentDescription = null)
    }
}
