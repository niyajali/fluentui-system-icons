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
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentIcons.Regular.Organization: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Organization",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.75f, 1.998f)
            curveTo(9.678f, 1.998f, 7.998f, 3.678f, 7.998f, 5.75f)
            curveTo(7.998f, 7.566f, 9.287f, 9.08f, 11f, 9.428f)
            verticalLineTo(11.5f)
            horizontalLineTo(7.75f)
            curveTo(6.507f, 11.5f, 5.5f, 12.508f, 5.5f, 13.75f)
            verticalLineTo(14.576f)
            curveTo(3.788f, 14.924f, 2.5f, 16.438f, 2.5f, 18.253f)
            curveTo(2.5f, 20.325f, 4.18f, 22.005f, 6.252f, 22.005f)
            curveTo(8.325f, 22.005f, 10.005f, 20.325f, 10.005f, 18.253f)
            curveTo(10.005f, 16.436f, 8.714f, 14.921f, 7f, 14.575f)
            verticalLineTo(13.75f)
            curveTo(7f, 13.336f, 7.336f, 13f, 7.75f, 13f)
            horizontalLineTo(15.75f)
            curveTo(16.164f, 13f, 16.5f, 13.336f, 16.5f, 13.75f)
            verticalLineTo(14.576f)
            curveTo(14.788f, 14.924f, 13.5f, 16.438f, 13.5f, 18.253f)
            curveTo(13.5f, 20.325f, 15.18f, 22.005f, 17.252f, 22.005f)
            curveTo(19.325f, 22.005f, 21.005f, 20.325f, 21.005f, 18.253f)
            curveTo(21.005f, 16.436f, 19.714f, 14.921f, 18f, 14.575f)
            verticalLineTo(13.75f)
            curveTo(18f, 12.508f, 16.993f, 11.5f, 15.75f, 11.5f)
            horizontalLineTo(12.5f)
            verticalLineTo(9.428f)
            curveTo(14.213f, 9.08f, 15.502f, 7.566f, 15.502f, 5.75f)
            curveTo(15.502f, 3.678f, 13.822f, 1.998f, 11.75f, 1.998f)
            close()
            moveTo(9.498f, 5.75f)
            curveTo(9.498f, 4.506f, 10.506f, 3.498f, 11.75f, 3.498f)
            curveTo(12.994f, 3.498f, 14.002f, 4.506f, 14.002f, 5.75f)
            curveTo(14.002f, 6.994f, 12.994f, 8.003f, 11.75f, 8.003f)
            curveTo(10.506f, 8.003f, 9.498f, 6.994f, 9.498f, 5.75f)
            close()
            moveTo(4f, 18.253f)
            curveTo(4f, 17.009f, 5.008f, 16f, 6.252f, 16f)
            curveTo(7.496f, 16f, 8.505f, 17.009f, 8.505f, 18.253f)
            curveTo(8.505f, 19.497f, 7.496f, 20.505f, 6.252f, 20.505f)
            curveTo(5.008f, 20.505f, 4f, 19.497f, 4f, 18.253f)
            close()
            moveTo(17.252f, 16f)
            curveTo(18.496f, 16f, 19.505f, 17.009f, 19.505f, 18.253f)
            curveTo(19.505f, 19.497f, 18.496f, 20.505f, 17.252f, 20.505f)
            curveTo(16.008f, 20.505f, 15f, 19.497f, 15f, 18.253f)
            curveTo(15f, 17.009f, 16.008f, 16f, 17.252f, 16f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun OrganizationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Organization, contentDescription = null)
    }
}
