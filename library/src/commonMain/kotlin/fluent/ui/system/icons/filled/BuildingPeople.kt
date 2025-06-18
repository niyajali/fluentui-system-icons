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

public val FluentUi.Filled.BuildingPeople: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BuildingPeople",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(4f, 4.25f)
            curveTo(4f, 3.007f, 5.007f, 2f, 6.25f, 2f)
            horizontalLineTo(13.75f)
            curveTo(14.993f, 2f, 16f, 3.007f, 16f, 4.25f)
            verticalLineTo(9.5f)
            horizontalLineTo(17.75f)
            curveTo(18.993f, 9.5f, 20f, 10.507f, 20f, 11.75f)
            verticalLineTo(13.05f)
            curveTo(19.32f, 13.188f, 18.741f, 13.601f, 18.383f, 14.169f)
            curveTo(18.023f, 12.916f, 16.868f, 12f, 15.5f, 12f)
            curveTo(13.843f, 12f, 12.5f, 13.343f, 12.5f, 15f)
            curveTo(12.5f, 15.805f, 12.817f, 16.536f, 13.333f, 17.074f)
            curveTo(11.997f, 17.378f, 11f, 18.573f, 11f, 20f)
            curveTo(11f, 20.664f, 11.148f, 21.367f, 11.506f, 22f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 22f, 4f, 21.664f, 4f, 21.25f)
            verticalLineTo(4.25f)
            close()
            moveTo(8f, 7.5f)
            curveTo(8.552f, 7.5f, 9f, 7.052f, 9f, 6.5f)
            curveTo(9f, 5.948f, 8.552f, 5.5f, 8f, 5.5f)
            curveTo(7.448f, 5.5f, 7f, 5.948f, 7f, 6.5f)
            curveTo(7f, 7.052f, 7.448f, 7.5f, 8f, 7.5f)
            close()
            moveTo(7f, 13.5f)
            curveTo(7f, 14.052f, 7.448f, 14.5f, 8f, 14.5f)
            curveTo(8.552f, 14.5f, 9f, 14.052f, 9f, 13.5f)
            curveTo(9f, 12.948f, 8.552f, 12.5f, 8f, 12.5f)
            curveTo(7.448f, 12.5f, 7f, 12.948f, 7f, 13.5f)
            close()
            moveTo(7f, 10f)
            curveTo(7f, 10.552f, 7.448f, 11f, 8f, 11f)
            curveTo(8.552f, 11f, 9f, 10.552f, 9f, 10f)
            curveTo(9f, 9.448f, 8.552f, 9f, 8f, 9f)
            curveTo(7.448f, 9f, 7f, 9.448f, 7f, 10f)
            close()
            moveTo(11f, 6.5f)
            curveTo(11f, 7.052f, 11.448f, 7.5f, 12f, 7.5f)
            curveTo(12.552f, 7.5f, 13f, 7.052f, 13f, 6.5f)
            curveTo(13f, 5.948f, 12.552f, 5.5f, 12f, 5.5f)
            curveTo(11.448f, 5.5f, 11f, 5.948f, 11f, 6.5f)
            close()
            moveTo(11f, 10f)
            curveTo(11f, 10.552f, 11.448f, 11f, 12f, 11f)
            curveTo(12.552f, 11f, 13f, 10.552f, 13f, 10f)
            curveTo(13f, 9.448f, 12.552f, 9f, 12f, 9f)
            curveTo(11.448f, 9f, 11f, 9.448f, 11f, 10f)
            close()
            moveTo(15.5f, 17f)
            curveTo(16.605f, 17f, 17.5f, 16.105f, 17.5f, 15f)
            curveTo(17.5f, 13.895f, 16.605f, 13f, 15.5f, 13f)
            curveTo(14.395f, 13f, 13.5f, 13.895f, 13.5f, 15f)
            curveTo(13.5f, 16.105f, 14.395f, 17f, 15.5f, 17f)
            close()
            moveTo(15.5f, 23f)
            curveTo(18.067f, 23f, 19f, 21.479f, 19f, 20f)
            curveTo(19f, 18.895f, 18.105f, 18f, 17f, 18f)
            horizontalLineTo(14f)
            curveTo(12.895f, 18f, 12f, 18.895f, 12f, 20f)
            curveTo(12f, 21.479f, 12.933f, 23f, 15.5f, 23f)
            close()
            moveTo(19.507f, 21.978f)
            curveTo(19.663f, 21.993f, 19.827f, 22f, 20f, 22f)
            curveTo(22.2f, 22f, 23f, 20.784f, 23f, 19.6f)
            curveTo(23f, 18.716f, 22.284f, 18f, 21.4f, 18f)
            horizontalLineTo(19.236f)
            curveTo(19.711f, 18.531f, 20f, 19.232f, 20f, 20f)
            curveTo(20f, 20.656f, 19.856f, 21.35f, 19.507f, 21.978f)
            close()
            moveTo(22f, 15.5f)
            curveTo(22f, 16.328f, 21.328f, 17f, 20.5f, 17f)
            curveTo(19.672f, 17f, 19f, 16.328f, 19f, 15.5f)
            curveTo(19f, 14.672f, 19.672f, 14f, 20.5f, 14f)
            curveTo(21.328f, 14f, 22f, 14.672f, 22f, 15.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BuildingPeoplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.BuildingPeople, contentDescription = null)
    }
}
