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

public val FluentUi.Filled.MailInboxCheckmark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MailInboxCheckmark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 6.5f)
            curveTo(22f, 9.538f, 19.538f, 12f, 16.5f, 12f)
            curveTo(13.462f, 12f, 11f, 9.538f, 11f, 6.5f)
            curveTo(11f, 3.462f, 13.462f, 1f, 16.5f, 1f)
            curveTo(19.538f, 1f, 22f, 3.462f, 22f, 6.5f)
            close()
            moveTo(19.854f, 4.146f)
            curveTo(19.658f, 3.951f, 19.342f, 3.951f, 19.146f, 4.146f)
            lineTo(15.5f, 7.793f)
            lineTo(13.854f, 6.146f)
            curveTo(13.658f, 5.951f, 13.342f, 5.951f, 13.146f, 6.146f)
            curveTo(12.951f, 6.342f, 12.951f, 6.658f, 13.146f, 6.854f)
            lineTo(15.146f, 8.854f)
            curveTo(15.342f, 9.049f, 15.658f, 9.049f, 15.854f, 8.854f)
            lineTo(19.854f, 4.854f)
            curveTo(20.049f, 4.658f, 20.049f, 4.342f, 19.854f, 4.146f)
            close()
            moveTo(19.5f, 12.268f)
            verticalLineTo(14f)
            horizontalLineTo(15f)
            curveTo(14.586f, 14f, 14.25f, 14.336f, 14.25f, 14.75f)
            curveTo(14.25f, 15.993f, 13.243f, 17f, 12f, 17f)
            curveTo(10.757f, 17f, 9.75f, 15.993f, 9.75f, 14.75f)
            lineTo(9.743f, 14.648f)
            curveTo(9.693f, 14.282f, 9.38f, 14f, 9f, 14f)
            horizontalLineTo(4.5f)
            verticalLineTo(7.25f)
            curveTo(4.5f, 6.284f, 5.284f, 5.5f, 6.25f, 5.5f)
            horizontalLineTo(10.076f)
            curveTo(10.157f, 4.977f, 10.3f, 4.474f, 10.498f, 4f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 4f, 3f, 5.455f, 3f, 7.25f)
            verticalLineTo(18.75f)
            curveTo(3f, 20.545f, 4.455f, 22f, 6.25f, 22f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 22f, 21f, 20.545f, 21f, 18.75f)
            verticalLineTo(11.19f)
            curveTo(20.556f, 11.617f, 20.051f, 11.981f, 19.5f, 12.268f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun MailInboxCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.MailInboxCheckmark, contentDescription = null)
    }
}
