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
package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
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

public val FluentUi.Filled.ShiftsProhibited: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ShiftsProhibited",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(12.022f)
            curveTo(4.01f, 11.375f, 5.211f, 11f, 6.5f, 11f)
            curveTo(8.248f, 11f, 9.834f, 11.69f, 11.002f, 12.812f)
            curveTo(11.001f, 12.792f, 11f, 12.771f, 11f, 12.75f)
            verticalLineTo(6.75f)
            curveTo(11f, 6.336f, 11.336f, 6f, 11.75f, 6f)
            curveTo(12.164f, 6f, 12.5f, 6.336f, 12.5f, 6.75f)
            verticalLineTo(12f)
            horizontalLineTo(16.25f)
            curveTo(16.664f, 12f, 17f, 12.336f, 17f, 12.75f)
            curveTo(17f, 13.164f, 16.664f, 13.5f, 16.25f, 13.5f)
            horizontalLineTo(11.75f)
            curveTo(11.704f, 13.5f, 11.658f, 13.496f, 11.614f, 13.488f)
            curveTo(12.482f, 14.593f, 13f, 15.986f, 13f, 17.5f)
            curveTo(13f, 18.789f, 12.625f, 19.99f, 11.978f, 21f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 21f, 21f, 19.545f, 21f, 17.75f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(12f, 17.5f)
            curveTo(12f, 20.538f, 9.538f, 23f, 6.5f, 23f)
            curveTo(3.462f, 23f, 1f, 20.538f, 1f, 17.5f)
            curveTo(1f, 14.462f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 14.462f, 12f, 17.5f)
            close()
            moveTo(2.5f, 17.5f)
            curveTo(2.5f, 18.333f, 2.755f, 19.108f, 3.191f, 19.748f)
            lineTo(8.748f, 14.191f)
            curveTo(8.108f, 13.755f, 7.334f, 13.5f, 6.5f, 13.5f)
            curveTo(4.291f, 13.5f, 2.5f, 15.291f, 2.5f, 17.5f)
            close()
            moveTo(6.5f, 21.5f)
            curveTo(8.709f, 21.5f, 10.5f, 19.709f, 10.5f, 17.5f)
            curveTo(10.5f, 16.667f, 10.245f, 15.892f, 9.809f, 15.252f)
            lineTo(4.252f, 20.809f)
            curveTo(4.892f, 21.245f, 5.666f, 21.5f, 6.5f, 21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ShiftsProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ShiftsProhibited, contentDescription = null)
    }
}
